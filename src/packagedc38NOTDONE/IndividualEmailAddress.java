package packagedc38NOTDONE;

import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

    public IndividualEmailAddress(String emailAddress) {
        super(emailAddress);
    }

    @Override
    protected Set<EmailAddress> getTargets() {
        return null;
    }

}
