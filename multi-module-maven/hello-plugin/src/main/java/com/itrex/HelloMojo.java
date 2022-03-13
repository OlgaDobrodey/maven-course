package com.itrex;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="hello")
public class HelloMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello this is PLUGIN",property = "hello.message")
    private String message;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(message);
    }
}
