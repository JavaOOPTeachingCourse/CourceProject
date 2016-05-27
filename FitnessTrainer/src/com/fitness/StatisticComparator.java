package com.fitness;

import java.util.Comparator;

/**
 * Created by Z on 5/27/2016.
 */
public enum StatisticComparator implements Comparator<Statistic> {
    DATE_TIME {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getDateTime() > o2.getDateTime()) {
                return 1;

            } else if (o1.getDateTime() < o2.getDateTime()) {
                return -1;
            }
            return 0;
        }
    },
    DATE_TIME_REVERS {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getDateTime() > o2.getDateTime()) {
                return -1;

            } else if (o1.getDateTime() < o2.getDateTime()) {
                return 1;
            }
            return 0;

        }
    },
    TYPE_OF_EXERCISE {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            return (o1.getTypeOfExercise().getName().compareTo(o2.getTypeOfExercise().getName()));
        }
    },
    TYPE_OF_EXERCISE_REVERS {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            return -1 * (o1.getTypeOfExercise().getName().compareTo(o2.getTypeOfExercise().getName()));
        }
    },
    EXERCISE_WEIGHT {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getExerciseWeight() > o2.getExerciseWeight()) {
                return 1;
            } else if (o1.getExerciseWeight() < o2.getExerciseWeight()) {
                return -1;
            }
            return 0;
        }
    },
    EXERCISE_WEIGHT_REVERS {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getExerciseWeight() > o2.getExerciseWeight()) {
                return -1;
            } else if (o1.getExerciseWeight() < o2.getExerciseWeight()) {
                return 1;
            }
            return 0;
        }
    },
    EXERCISE_COUNT {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            return (int) (o1.getExerciseCount() - o2.getExerciseCount());
        }
    },
    EXERCISE_COUNT_REVERS {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            return (int) -1 * (o1.getExerciseCount() - o2.getExerciseCount());
        }
    },
    WORK {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getWork() > o2.getWork()) {
                return 1;
            } else if (o1.getWork() < o2.getWork()) {
                return -1;
            }
            return 0;
        }
    },
    WORK_REVERS {
        @Override
        public int compare(Statistic o1, Statistic o2) {
            if (o1.getWork() > o2.getWork()) {
                return -1;
            } else if (o1.getWork() < o2.getWork()) {
                return 1;
            }
            return 0;
        }
    };

    public static Comparator<Statistic> getComparator(final StatisticComparator... comparator) {
        return new Comparator<Statistic>() {
            @Override
            public int compare(Statistic o1, Statistic o2) {
                for (StatisticComparator option : comparator) {
                    int result = option.compare(o1, o2);
                    if (result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };
    }

}
