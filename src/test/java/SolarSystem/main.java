package SolarSystem;

public class main {

    public static void main(String[] args) {
        solarSystemBasics solars= new solarSystemBasics();
        solars.Sun="1";
        solars.Moon="2";
        solars.Planets="2";
        solars.Stars="10";
        //*************** Feature Sun********
        FeatureSun Sun= new FeatureSun();
        Sun.name="panther";
        Sun.name="black";
        Sun.temp="-55564626 kelvin";

        Planet1 plato= new Planet1();
        plato.color="green";
        plato.name="abracadabra";
        plato.temp="155564955125k";
        plato.radius="800002km";

    }
}
