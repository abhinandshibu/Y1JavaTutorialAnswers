package packagedc38NOTDONE;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

    private final Set<EmailAddress> container;

    public GroupEmailAddress(String emailAddress) {
        super(emailAddress);
        this.container = new HashSet<>();
    }

    @Override
    protected Set<EmailAddress> getTargets() {
        return null;
    }

    public void addEmailAddress(EmailAddress a) {
        container.add(a);
    }



}
