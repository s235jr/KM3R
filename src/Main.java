public class Main {
    public static void main(String args[]) {
        String typeOfEdge = "N+ N0 F+ F+"; // Fourier, Neumann+, NeumannZero (Top, Bottom, Left, Right)
        String startTempForEdge = "35.0 18.0 30.0 70.0"; // Top, Bottom, Left, Rigth
        String sizeOfModel = "10 10";    //width, heigth
        String insideGeneratorOfHeat = "5 5 20 25";   //firstCordOfCornet, secondCordOfCorner, width, heigth
        int iteration = 8;

        WorkSpace workSpace = new WorkSpace(sizeOfModel);
        workSpace.generateEdges(startTempForEdge);
        for (int i = 0; i < iteration; i++) {
            workSpace.iteration();
        }
        System.out.println(workSpace.doStringa(typeOfEdge));
    }

}
