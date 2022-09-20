package exam;

public abstract class Pet {
    private boolean getsCuddled;

    public Pet(boolean getsCuddled) {
        this.getsCuddled = getsCuddled;
    }

    public boolean isGetsCuddled() {
        return getsCuddled;
    }

    public void setGetsCuddled(boolean getsCuddled) {
        this.getsCuddled = getsCuddled;
    }
    public abstract void cuddledOrNot();
}
