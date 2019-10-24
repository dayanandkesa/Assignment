package util;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import behaviour.CanFly;
import behaviour.CanSing;
import behaviour.CanSwim;
import behaviour.CanWalk;
import behaviour.Flyable;
import behaviour.Singable;
import behaviour.Swimmable;
import behaviour.Walkable;
import model.LivingThing;

public class CountAnimals {

    public long walkableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Walkable> walkables = LivingThing::getWalkable;
        return getCount(livingThings, walkables, walkable -> walkable instanceof CanWalk);
    }

    public long flyableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Flyable> flyables = LivingThing::getFlyable;
        return getCount(livingThings, flyables, flyable -> flyable instanceof CanFly);
    }

    public long singableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Singable> singables = LivingThing::getSingable;
        return getCount(livingThings, singables, singable -> singable instanceof CanSing);
    }

    public long swimmableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Swimmable> swimmables = LivingThing::getSwimmable;
        return getCount(livingThings, swimmables, swimmable -> swimmable instanceof CanSwim);
    }

    private long getCount(List<LivingThing> livingThings, Function function, Predicate predicate) {
        return Optional.ofNullable(livingThings).map(Collection::parallelStream).orElseGet(Stream::empty)
                .map(function)
                .filter(predicate)
                .count();
    }

}
