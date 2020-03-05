package com.newline.track.android.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


class NewlineAutoTrackPlugin implements Plugin<Project>{


    @Override
    void apply(Project project) {

        boolean disableNewlineAutoTrackPlugin = false
        Properties properties = new Properties()
        if (project.rootProject.file('gradle.properties').exists()) {
            properties.load(project.rootProject.file('gradle.properties').newDataInputStream())
            disableNewlineAutoTrackPlugin = Boolean.parseBoolean(properties.getProperty("disableNewlineAutoTrackPlugin", "false"))
        }

        if(disableNewlineAutoTrackPlugin){
            Logger.warn("Disable NewlineAutoTrack plugin")
        }else{
            NewlineTrackTransform trackTransform = new NewlineTrackTransform(project)
            AppExtension appExtension = project.extensions.findByType(AppExtension.class)
            appExtension.registerTransform(trackTransform)
        }

    }
}