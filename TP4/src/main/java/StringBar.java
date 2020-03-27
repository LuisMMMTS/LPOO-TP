public class StringBar extends Bar {
    boolean happyHour;
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour=true;
    }

    @Override
    public void endHappyHour() {
        happyHour=false;
    }
}
