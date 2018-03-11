public class Model {
    String[][] model;


    Model(String sizeOfModel) {
        CordForModel cordForModel = new CordForModel(sizeOfModel);
        this.model = new String[cordForModel.arrayheigth][cordForModel.arraywidth];
        for (int i = 0; i < cordForModel.arrayheigth; i++) {
            for (int k = 0; k < cordForModel.arraywidth; k++)
                this.model[i][k] = "00";
        }
    }

    public void generateNameOfEdge(String typofEdge) {
        TypEdge edge = new TypEdge(typofEdge);
        for (int i = 0; i < model.length; i++) {
            for (int k = 0; k < model[i].length; k++) {
                this.model[0][k] = edge.typTop;
            }
        }
        for (int i = 0; i < model.length; i++) {
            for (int k = 0; k < model[i].length; k++) {
                this.model[model.length - 1][k] = edge.typBottom;
            }
        }
        for (int i = 0; i < model.length; i++) {
            this.model[i][0] = edge.typRight;
        }
        for (int i = 0; i < model.length; i++) {
            this.model[i][model[i].length - 1] = edge.typLeft;
        }

        this.model[0][0] = "/";
        this.model[0][model[0].length - 1] = "\\";
        this.model[model.length - 1][0] = "\\";
        this.model[model.length - 1][model[0].length - 1] = "/";
    }

    public void generateEdges(String startTempForEdge) {
        StartValue edgeTemp = new StartValue(startTempForEdge);
        for (int i = 1; i < model.length - 1; i++) {
            for (int k = 1; k < model[i].length - 1; k++) {
                this.model[1][k] = edgeTemp.top;
            }
        }
        for (int i = 1; i < model.length - 1; i++) {
            for (int k = 1; k < model[i].length - 1; k++) {
                this.model[model.length - 2][k] = edgeTemp.bottom;
            }
        }
        for (int i = 1; i < model.length - 1; i++) {
            this.model[i][1] = edgeTemp.left;
        }
        for (int i = 1; i < model.length-1; i++) {
            this.model[i][model.length] = edgeTemp.rigth;
        }
        this.model[1][1] = Integer.toString((Integer.parseInt(edgeTemp.top) + Integer.parseInt(edgeTemp.left)) / 2);
        this.model[1][model[0].length - 2] = Integer.toString((Integer.parseInt(edgeTemp.top) + Integer.parseInt(edgeTemp.rigth)) / 2);
        this.model[model.length - 2][1] = Integer.toString((Integer.parseInt(edgeTemp.bottom) + Integer.parseInt(edgeTemp.left)) / 2);
        this.model[model.length - 2][model[0].length - 2] = Integer.toString((Integer.parseInt(edgeTemp.bottom) + Integer.parseInt(edgeTemp.rigth)) / 2);
    }

    public void iteration() {
        for (int i = 2; i < model.length - 2; i++) {
            for (int k = 2; k < model[i].length - 2; k++) {
                this.model[i][k] = Integer.toString((Integer.parseInt(this.model[i - 1][k - 1]) + Integer.parseInt(this.model[i - 1][k + 1]) + Integer.parseInt(this.model[i + 1][k - 1]) + Integer.parseInt(this.model[i + 1][k + 1])) / 4);
            }
        }
    }

    public String doStringa() {
        String modelInString = " ";
        for (int i = 0; i < model.length; i++) {
            for (int k = 0; k < model[i].length; k++) {
                if (i == 0 || i == model.length - 1) {
                    modelInString += this.model[i][k] + "   ";
                } else {
                    modelInString += this.model[i][k] + "   ";
                }
            }
            if (i == model.length - 2) {
                modelInString += '\n' + " ";
            } else {
                modelInString += '\n';
            }
        }
        return modelInString;

    }
}


/*
    Model(Model model) {
        int lengthWidth;
        int lengthHeigth;
        int indeksMaxWidth;
        int indeksMaxHeigth;
        int indeksMinWidth;
        int indeksMinHeigth;

        //lengthWidth=this.model.length;

    }
    */