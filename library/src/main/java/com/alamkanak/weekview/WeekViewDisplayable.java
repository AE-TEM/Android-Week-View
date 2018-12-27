package com.alamkanak.weekview;

import android.support.annotation.NonNull;

/**
 * This interface can be implemented by classes that should be displayed in {@link WeekView}.
 * Instead of having to provide a list of {@link WeekViewEvent}s, you can provide a list of elements
 * of your class. The conversion to {@link WeekViewEvent} will happen in the background.
 */
public interface WeekViewDisplayable<T> {

    /**
     * Returns a {@link WeekViewEvent} for use in {@link WeekView}.
     * @return A {@link WeekViewEvent}
     */
    @NonNull
    WeekViewEvent<T> toWeekViewEvent();

}
