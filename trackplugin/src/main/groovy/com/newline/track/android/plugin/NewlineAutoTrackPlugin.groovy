package com.newline.track.android.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


class NewlineAutoTrackPlugin implements Plugin<Project>{


    @Override
    void apply(Project project) {
        NewlineTrackTransform trackTransform = new NewlineTrackTransform(project)
        AppExtension appExtension = project.extensions.findByType(AppExtension.class)
        appExtension.registerTransform(trackTransform)
    }
}