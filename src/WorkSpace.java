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
        Double[][] workspaceToIteration = new Double[workSpace.length][workSpace[0].length];
        double insideValue;

        for (int i = 0; i < workspaceToIteration.length; i++) {
            for (int k = 0; k < workspaceToIteration[i].length; k++) {
                workspaceToIteration[i][k] = workSpace[i][k];
            }
        }

        for (int i = 1; i < workspaceToIteration.length - 1; i++) {
            for (int k = 1; k < workspaceToIteration[i].length - 1; k++) {
                insideValue = (workspaceToIteration[i - 1][k - 1] + workspaceToIteration[i - 1][k + 1] + workspaceToIteration[i + 1][k - 1] + workspaceToIteration[i + 1][k + 1]) / 4;
                this.workSpace[i][k] = insideValue;
            }
        }
    }

    public String doStringa(String typofEdge) {
        TypEdge edge = new TypEdge(typofEdge);
        String[][] workSpaceToString = new String[workSpace.length + 2][workSpace[0].length + 2];


        for (int k = 0; k < workSpaceToString[0].length; k++) {
            workSpaceToString[0][k] = edge.typTop;
        }

        for (int k = 0; k < workSpaceToString[0].length; k++) {
            workSpaceToString[workSpaceToString.length - 1][k] = edge.typBottom;
        }

        for (int i = 0; i < workSpaceToString.length; i++) {
            workSpaceToString[i][0] = edge.typRight;
        }
        for (int i = 0; i < workSpaceToString.length; i++) {
            workSpaceToString[i][workSpaceToString[i].length - 1] = edge.typLeft;
        }

        workSpaceToString[0][0] = "/";
        workSpaceToString[0][workSpaceToString[0].length - 1] = "\\";
        workSpaceToString[workSpaceToString.length - 1][0] = "\\";
        workSpaceToString[workSpaceToString.length - 1][workSpaceToString[0].length - 1] = "/";

        for (int i = 1; i < workSpaceToString.length - 1; i++) {
            for (int k = 1; k < workSpaceToString[1].length - 1; k++) {
                workSpaceToString[i][k] = String.format("%.2f", workSpace[i - 1][k - 1]);
            }
        }

        String modelInString = " ";
        for (int i = 0; i < workSpaceToString.length; i++) {
            for (int k = 0; k < workSpaceToString[i].length; k++) {
                modelInString += workSpaceToString[i][k] + "   ";
            }
            modelInString += '\n' + " ";
        }
        return modelInString;
    }

}
