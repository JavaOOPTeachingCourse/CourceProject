package com.fitness;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Z on 5/29/2016.
 */
public class StatisticPredicate {
    public static Predicate<Statistic> dateMoreThen(long dateTime) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {

                return statistic.getDateTime() > dateTime;
            }
        };
    }

    public static Predicate<Statistic> dateLessThen(long dateTime) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getDateTime() < dateTime;
            }
        };
    }

    public static Predicate<Statistic> dateEquals(long dateTime) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getDateTime() == dateTime;
            }
        };
    }

    public static Predicate<Statistic> exerciseTypeEquails(Exercise exerciseType) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getTypeOfExercise().equals(exerciseType);
            }
        };
    }

    public static Predicate<Statistic> exerciseTypeNotEquails(Exercise exerciseType) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return !(statistic.getTypeOfExercise().equals(exerciseType));
            }
        };
    }

    public static Predicate<Statistic> exerciseWeightMoreThen(double exerciseWeight) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseWeight() > exerciseWeight;
            }
        };
    }

    public static Predicate<Statistic> exerciseWeightLessThen(double exerciseWeight) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseWeight() < exerciseWeight;
            }
        };
    }

    public static Predicate<Statistic> exerciseWeightEquals(double exerciseWeight) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                BigDecimal par1 = new BigDecimal(statistic.getExerciseWeight());
                BigDecimal par2 = new BigDecimal(exerciseWeight);
                return par1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() == par2.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            }
        };
    }

    public static Predicate<Statistic> exerciseCountLessThen(int exerciseCount) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseCount() < exerciseCount;
            }
        };
    }

    public static Predicate<Statistic> exerciseCountMoreThen(int exerciseCount) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseCount() > exerciseCount;
            }
        };
    }

    public static Predicate<Statistic> exerciseCountEquals(int exerciseCount) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseCount() == exerciseCount;
            }
        };
    }

    public static Predicate<Statistic> workEquals(double work) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                BigDecimal par1 = new BigDecimal(statistic.getWork());
                BigDecimal par2 = new BigDecimal(work);
                return par1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() == par2.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

            }
        };
    }

    public static Predicate<Statistic> workLessThen(double work) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseWeight() < work;
            }
        };

    }

    public static Predicate<Statistic> workMoreThen(double work) {
        return new Predicate<Statistic>() {
            @Override
            public boolean test(Statistic statistic) {
                return statistic.getExerciseWeight() > work;
            }
        };

    }
    public static List<Statistic> filter(List<Statistic> notFiltered, Predicate<Statistic> predicate) {
        List<Statistic> result = new ArrayList<Statistic>();
        for (Statistic stat : notFiltered) {
            if (predicate.test(stat)) {
                result.add(stat);
            }
        }
        return result;
    }
}
