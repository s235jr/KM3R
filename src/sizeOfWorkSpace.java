public class sizeOfWorkSpace {
    public int width;
    public int heigth;
    public int arraywidth;
    public int arrayheigth;


    sizeOfWorkSpace(String sizeOfModel) {
        String[] valueForModel = sizeOfModel.split(" ");
        this.width = Integer.parseInt(valueForModel[0]);
        this.heigth = Integer.parseInt(valueForModel[1]);
        this.arraywidth = this.width + 2;
        this.arrayheigth = this.heigth + 2;
        //System.out.println("Szerokość modelu: " + valueForModel[0]);   //jak tutaj zwiekszyć wartość o 4?
        //System.out.println("Wysokość modelu: " + valueForModel[1]);
        //System.out.println("Szerokość tablicy dla modelu: " + this.arraywidth);
        //System.out.println("Wysokość tablicy dla modelu: " + this.arrayheigth);


    }
}
