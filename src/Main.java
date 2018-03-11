public class Main {
    public static void main(String args[]) {
        String typeOfEdge = "N+ N0 F+ F+"; // Fourier, Neumann+, NeumannZero (Top, Bottom, Left, Right)
        String startTempForEdge = "10 20 30 40"; // Top, Bottom, Left, Rigth
        String sizeOfModel = "6 4";    //width, heigth
        String insideGeneratorOfHeat = "5 5 20 25";   //firstCordOfCornet, secondCordOfCorner, width, heigth
        int iteration = 100;  // estetycznie wygląda > 3

        Model model = new Model(sizeOfModel);
        //System.out.println("Model początkowy: " + '\n' + '\n' + model.doStringa());
        //TypEdge edge = new TypEdge(typeOfEdge);
        model.generateNameOfEdge(typeOfEdge);
        //System.out.println("Model z ramkami: " + '\n' + '\n' + model.doStringa());
        //System.out.println(model.doStringa());
        //Model model = new Model(model);
        model.generateEdges(startTempForEdge);
        for (int i = 0; i < iteration; i++){
            model.iteration();
        }
        System.out.println(model.doStringa());


    }

}
