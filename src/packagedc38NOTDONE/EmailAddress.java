package packagedc38NOTDONE;

import java.util.Objects;
import java.util.Set;

public abstract class EmailAddress {

    private final String emailAddress;

    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    protected abstract Set<EmailAddress> getTargets();

    @Override
    public String toString() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress that = (EmailAddress) o;
        return Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress);
    }

}
