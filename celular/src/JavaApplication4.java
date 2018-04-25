public class JavaApplication4 {
    public static void main(String[] args) {
        //objetos do celular
        Bateria b = new Bateria(3000);
        Ram r = new Ram("LPDDR4",4);
        Camera c = new Camera(12);
        Processador p = new Processador("SAMSUNG","Exynos 9 8895",2.3);
        Tela t = new Tela(5.8,"1440 x 2960");
        //samsung s8     
        Celular samsung = new Celular(r,p,t,b,c);
        samsung.setBateria(b);
        samsung.setCamera(c);
        samsung.setProcessasdor(p);
        samsung.setRam(r);
        samsung.setTela(t);
        //objetos do celular
        Bateria b1 = new Bateria(1960);
        Ram r1 = new Ram("LPDDR4",2);
        Camera c1 = new Camera(12);
        Processador p1 = new Processador("Apple A10 Fusion","A10 Fusion",2.34);
        Tela t1 = new Tela(5.8,"1440 x 2960");        
        //Iphone7
        Celular iphone = new Celular(r,p,t,b,c);
        iphone.setBateria(b1);
        iphone.setCamera(c1);
        iphone.setProcessasdor(p1);
        iphone.setRam(r1);
        iphone.setTela(t1);

    }
}
