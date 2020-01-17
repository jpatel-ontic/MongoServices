package user;

public class User {
    private final String email;
    private final String firstName;
    private final String lastName;

    private User(UserBuilder userBuilder) {
        email = userBuilder.email;
        firstName = userBuilder.firstName;
        lastName = userBuilder.lastName;

    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public static class UserBuilder {
        private final String email;
        private String firstName;
        private String lastName;

        public UserBuilder(String email) {
            this.email = email;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        public User build() {
            return new User(this);
        }

    }


}
