public class StartValue {
    Double top;
    Double bottom;
    Double left;
    Double rigth;

    StartValue(String startTempForEdge){
        String[] valufeOfTemp = startTempForEdge.split(" ");
        top = Double.parseDouble(valufeOfTemp[0]);
        bottom = Double.parseDouble(valufeOfTemp[1]);
        left = Double.parseDouble(valufeOfTemp[2]);
        rigth = Double.parseDouble(valufeOfTemp[3]);
        //System.out.println("Temperatura górnej krawędzi: " + valufeOfTemp[0]);
        //System.out.println("Temperatura dolnej krawędzi: " + valufeOfTemp[1]);
        //System.out.println("Temperatura lewej krawędzi: " + valufeOfTemp[2]);
        //System.out.println("Temperatura prawej krawędzi: " + valufeOfTemp[3]);
    }


}
