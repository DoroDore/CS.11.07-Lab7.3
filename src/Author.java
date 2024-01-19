public class Author {
    private final String mName;
    private String mEmail;
    private final char mGender;
    public Author(String name, String email, char gender) {
        mName = name;
        mEmail = email;
        mGender = gender;
    }
    public void setEmail(String email) {
        mEmail = email;
    }
    public String getEmail() {
        return mEmail;
    }
    public String getName() {
        return mName;
    }
    public char getGender() {
        return mGender;
    }
    @Override
    public String toString() {
        return (mName + " (" + mGender + ") at " + mEmail);
    }

}
