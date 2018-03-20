public class WorkSpace {
    Double[][] workSpace;

    WorkSpace(String sizeOfModel) {
        sizeOfWorkSpace workSpace = new sizeOfWorkSpace(sizeOfModel);
        this.workSpace = new Double[workSpace.arraywidth][workSpace.arrayheigth];
        for (int i = 1; i < workSpace.arraywidth - 1; i++) {
            for (int k = 1; k < workSpace.arrayheigth - 1; k++) {
                this.workSpace[i][k] = 0.0;
            }
        }
    }

    public void generateEdges(String startTempForEdge) {
        StartValue edgeTemp = new StartValue(startTempForEdge);

        for (int k = 0; k < workSpace[0].length - 1; k++) {
            this.workSpace[0][k] = edgeTemp.top;
        }

        for (int k = 0; k < workSpace[0].length - 1; k++) {
            this.workSpace[workSpace.length - 1][k] = edgeTemp.bottom;
        }

        for (int i = 0; i < workSpace.length - 1; i++) {
            this.workSpace[i][0] = edgeTemp.left;
        }
        for (int i = 0; i < workSpace.length - 1; i++) {
            this.workSpace[i][workSpace[0].length - 1] = edgeTemp.rigth;
        }
        this.workSpace[0][0] = (edgeTemp.top + edgeTemp.left) / 2;
        this.workSpace[0][workSpace[0].length - 1] = (edgeTemp.top + edgeTemp.rigth) / 2;
        this.workSpace[workSpace.length - 1][0] = (edgeTemp.bottom + edgeTemp.left) / 2;
        this.workSpace[workSpace.length - 1][workSpace[0].length - 1] = (edgeTemp.bottom + edgeTemp.rigth) / 2;
    }

    public void iteration() {
        Double[][] workSpaceBeforeIteration = new Double[workSpace.length][workSpace[0].length];
        double insideValue;

        for (int i = 0; i < workSpaceBeforeIteration.length; i++) {
            for (int k = 0; k < workSpaceBeforeIteration[i].length; k++) {
                workSpaceBeforeIteration[i][k] = workSpace[i][k];
            }
        }

        for (int i = 1; i < workSpaceBeforeIteration.length - 1; i++) {
            for (int k = 1; k < workSpaceBeforeIteration[i].length - 1; k++) {
                insideValue = (workSpaceBeforeIteration[i - 1][k - 1] + workSpaceBeforeIteration[i - 1][k + 1] + workSpaceBeforeIteration[i + 1][k - 1] + workSpaceBeforeIteration[i + 1][k + 1]) / 4;
                this.workSpace[i][k] = insideValue;
            }
        }
    }

    public String doStringa() {
        String modelInString = " ";
        for (int i = 0; i < workSpace.length; i++) {
            for (int k = 0; k < workSpace[i].length; k++) {
                modelInString += String.format("%.2f", this.workSpace[i][k]) + "   ";
            }
            modelInString += '\n' + " ";
        }
        return modelInString;
    }

}


    /*public void generateNameOfEdge(String typofEdge) {
        TypEdge edge = new TypEdge(typofEdge);

        for (int k = 0; k < workSpace[0].length; k++) {
            this.workSpace[0][k] = edge.typTop;
        }

        for (int k = 0; k < workSpace[0].length; k++) {
            this.workSpace[workSpace.length - 1][k] = edge.typBottom;
        }

        for (int i = 0; i < workSpace.length; i++) {
            this.workSpace[i][0] = edge.typRight;
        }
        for (int i = 0; i < workSpace.length; i++) {
            this.workSpace[i][workSpace[i].length - 1] = edge.typLeft;
        }

        this.workSpace[0][0] = "/";
        this.workSpace[0][workSpace[0].length - 1] = "\\";
        this.workSpace[workSpace.length - 1][0] = "\\";
        this.workSpace[workSpace.length - 1][workSpace[0].length - 1] = "/";
    }*/




