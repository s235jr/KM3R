public class TypEdge {
    String typTop;
    String typBottom;
    String typLeft;
    String typRight;

    TypEdge(String startOfTypEdge) {
        String[] edge = startOfTypEdge.split(" ");
        this.typTop = edge[0];
        this.typBottom = edge[1];
        this.typLeft = edge[2];
        this.typRight = edge[3];
        //System.out.println("Krawędź górna: " + typTop);
        //System.out.println("Krawędź dolna: " + typBottom);
        //System.out.println("Krawędź lewa: " + typLeft);
        //System.out.println("Krawędź prawa: " + typRight);


    }

}
