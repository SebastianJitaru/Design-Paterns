import java.util.ArrayList;
import java.util.List;

public class Email {
    private final String from;
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> ccTo;
    public Email(
            String from, List<String> to, String subject, String body,
            List<String> ccTo) {
        this.from = from; this.to = to; this.subject = subject;
        this.body = body; this.ccTo = ccTo;
    }

    public Email(Builder builder) {
        this.body= builder.body;
        this.from = builder.from;
        this.to = builder.to;
        this.subject= builder.subject;
        this.ccTo = builder.ccTo;

    }

    public String getFrom() {
        return from;
    }

    public List<String> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getCcTo() {
        return ccTo;
    }

    public static class Builder {
        private String from;
        private List<String> to;
        private String subject;
        private String body;
        private List<String> ccTo = null;

        public Builder() {
            // constructor privat per a restringir la creació de la instància del builder
        }

        public Builder builder() {
            return new Builder();
        }

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            if (this.to == null) {
                this.to = new ArrayList<>();
            }
            this.to.add(to);
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder ccTo(String ccTo) {
            if (this.ccTo == null) {
                this.ccTo = new ArrayList<>();
            }
            this.ccTo.add(ccTo);
            return this;
        }

        public Email make() {
            if (from == null || from.isEmpty() || subject == null || subject.isEmpty() || body == null || body.isEmpty()) {
                throw new EmailBuilderException("Missing required fields: from, subject, or body");
            }

            return new Email(this);
        }
    }


}
