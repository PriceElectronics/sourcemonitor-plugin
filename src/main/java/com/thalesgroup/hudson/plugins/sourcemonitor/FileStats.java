package com.thalesgroup.hudson.plugins.sourcemonitor;

import java.io.Serializable;
import java.util.*;

// serializable required for multibranch pipeline
public class FileStats implements Serializable {

    private String fileName;
    private int numFunctions;
    private int numStatements;
    private int maxComplexity;
    private ArrayList<FunctionStats> functionStats;

    public FileStats() {
        functionStats = new ArrayList<FunctionStats>();
    }

    public void addFunction(FunctionStats newFunction){
        functionStats.add(newFunction);
    }

    public ArrayList<FunctionStats> getFunctionStats() {
        return functionStats;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getNumFunctions() {
        return numFunctions;
    }

    public void setNumFunctions(int numFunctions) {
        this.numFunctions = numFunctions;
    }

    public int getNumStatements() {
        return numStatements;
    }

    public void setNumStatements(int numStatements) {
        this.numStatements = numStatements;
    }

    public int getMaxComplexity() {
        return maxComplexity;
    }

    public void setMaxComplexity(int maxComplexity) {
        this.maxComplexity = maxComplexity;
    }

    public String getFunctionOutput(){
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<functionStats.size();i++){
            builder.append("<tr><td>");
            builder.append(functionStats.get(i).getFunction());
            builder.append("</td><td>");
            builder.append(functionStats.get(i).getComplexity());
            builder.append("</td><td>");
            builder.append(functionStats.get(i).getStatements());
            builder.append("</td></tr>");
        }
        return builder.toString();
    }
}
