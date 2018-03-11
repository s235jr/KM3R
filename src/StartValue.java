public class StartValue {
    String top;
    String bottom;
    String left;
    String rigth;

    StartValue(String startTempForEdge){
        String[] valufeOfTemp = startTempForEdge.split(" ");
        top = valufeOfTemp[0];
        bottom = valufeOfTemp[1];
        left = valufeOfTemp[2];
        rigth = valufeOfTemp[3];
        //System.out.println("Temperatura górnej krawędzi: " + valufeOfTemp[0]);
        //System.out.println("Temperatura dolnej krawędzi: " + valufeOfTemp[1]);
        //System.out.println("Temperatura lewej krawędzi: " + valufeOfTemp[2]);
        //System.out.println("Temperatura prawej krawędzi: " + valufeOfTemp[3]);
    }


}
