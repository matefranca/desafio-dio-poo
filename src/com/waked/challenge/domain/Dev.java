package src.com.waked.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentsSubscribed = new LinkedHashSet<>();
    private Set<Content> contentsFinished = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        contentsSubscribed.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = contentsSubscribed.stream().findFirst();
        if (content.isPresent()) {
            contentsFinished.add(content.get());
            contentsSubscribed.remove(content.get());
        } else {
            System.out.println("You are not subscribed in any content!");
        }
    }

    public double calculateTotalXP() {
        return contentsFinished.stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribed() {
        return contentsSubscribed;
    }

    public void setContentsSubscribed(Set<Content> contentsSubscribed) {
        this.contentsSubscribed = contentsSubscribed;
    }

    public Set<Content> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Content> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribed, dev.contentsSubscribed) && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribed, contentsFinished);
    }
}
