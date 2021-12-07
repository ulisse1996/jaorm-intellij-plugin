package com.github.ulisse1996.jaormintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.ulisse1996.jaormintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
