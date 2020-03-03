package com.newline.track.android.plugin

import com.android.build.api.transform.Context
import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformException
import com.android.build.api.transform.TransformInput
import com.android.build.api.transform.TransformOutputProvider
import com.android.build.gradle.internal.pipeline.TransformManager
import org.gradle.api.Project


class NewlineTrackTransform extends Transform {

    private static Project project

    NewlineTrackTransform(Project project) {
        this.project = project
    }


    /**
     * 定义对应gradle中Task的名称
     * @return
     */
    @Override
    String getName() {
        return "NewlineAutoTrack"
    }

    /**
     * 需求处理的数据类型
     * @return TransformManager.CONTENT_CLASS 处理java的class文件
     */
    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_RESOURCES
    }

    /**
     * Transform 需要操作的内容范围
     * @return TransformManager.SCOPE_FULL_PROJECT 整个项目
     */
    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }


    static void printCopyRight() {
        println()
        println("########################################################################")
        println("#######                                                        #########")
        println("#######                                                        #########")
        println("#######     Welcome to use NewlineAutoTrack® plugin            #########")
        println("#######     If you encounter any problems during use,          #########")
        println("#######     please contact the newline R & D team.             #########")
        println("#######                                                        #########")
        println("#######                                                        #########")
        println("#######                                                        #########")
        println("########################################################################")
        println("########################################################################")
        println()
    }

    @Override
    void transform(Context context, Collection<TransformInput> inputs, Collection<TransformInput> referencedInputs, TransformOutputProvider outputProvider, boolean isIncremental) throws IOException, TransformException, InterruptedException {
        printCopyRight()
    }
}