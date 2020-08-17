package com.github.koundinyagoparaju.exercismintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.koundinyagoparaju.exercismintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
