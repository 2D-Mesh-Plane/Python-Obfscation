package org.madmeg.api.obfuscator.tasks;

import org.madmeg.api.obfuscator.Loader;
import org.madmeg.api.obfuscator.tasks.elements.AddGarbage;
import org.madmeg.impl.Core;

/**
 * @author Madmegsox1
 * @since 09/12/2021
 */

public final class TaskFactory {
    private final TaskManager taskManager;

    public TaskFactory(){
        taskManager = new TaskManager();
    }

    private void poolTasks(){

        int size = Loader.FILE.lines.size();

        if(Core.CONFIG.isVarNames()){
            // TODO pool var name change task
        }
        if(Core.CONFIG.isDefNames()){
            // TODO pool def name change task
        }
        if(Core.CONFIG.isClassNames()){
            // TODO pool class name change task
        }
        if(Core.CONFIG.isInsertGarbage()){
            for(int i=0; i < size; i+= 100){
                taskManager.queueTask(new AddGarbage(Loader.FILE, i));
            }
        }
        if(Core.CONFIG.isInsertObfStrings()){
            for(int i=0; i < size; i+= 100) {
                // TODO pool obf string task
            }
        }



    }

}
