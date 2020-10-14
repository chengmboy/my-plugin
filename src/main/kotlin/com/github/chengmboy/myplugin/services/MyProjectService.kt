package com.github.chengmboy.myplugin.services

import com.intellij.openapi.project.Project
import com.github.chengmboy.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
