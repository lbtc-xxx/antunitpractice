package org.nailedtothex.antunitpractice;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MyTask extends Task {

    private String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public void execute() throws BuildException {
        getProject().setNewProperty(property, "Hello from MyTask");
    }
}
