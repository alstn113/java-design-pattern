package behavioral_pattern.iterator.iterators;

import behavioral_pattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
