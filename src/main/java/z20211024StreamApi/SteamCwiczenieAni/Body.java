package z20211024StreamApi.SteamCwiczenieAni;

public class Body {
    BodyType bodyType;
    public String kolor;



    public Body(BodyType bodyType, String kolor) {
        this.bodyType = bodyType;
        this.kolor = kolor;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }


    @Override
    public String toString() {
        return  bodyType + " " + kolor + " " ;
    }
}
