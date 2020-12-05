package com.github.isthatcentered.intellijpluginhelloworld.services

import com.intellij.openapi.project.Project
import com.github.isthatcentered.intellijpluginhelloworld.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
