/*
 * Copyright (c) 2016-2021 VMware Inc. or its affiliates, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.j13n.core.commons.base.function;

import java.util.Objects;
import java.util.function.Function;
import reactor.util.annotation.NonNull;
import reactor.util.annotation.Nullable;

/**
 * A tuple that holds eight values
 *
 * @param <T1> The type of the first value held by this tuple
 * @param <T2> The type of the second value held by this tuple
 * @param <T3> The type of the third value held by this tuple
 * @param <T4> The type of the fourth value held by this tuple
 * @param <T5> The type of the fifth value held by this tuple
 * @param <T6> The type of the sixth value held by this tuple
 * @param <T7> The type of the seventh value held by this tuple
 * @param <T8> The type of the eighth value held by this tuple
 * @author Jon Brisbin
 * @author Stephane Maldini
 */
public class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> extends Tuple7<T1, T2, T3, T4, T5, T6, T7> {

    private static final long serialVersionUID = -8746796646535446242L;

    @NonNull final T8 t8;

    Tuple8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        super(t1, t2, t3, t4, t5, t6, t7);
        this.t8 = Objects.requireNonNull(t8, "t8");
    }

    /**
     * Type-safe way to get the eighth object of this {@link Tuples}.
     *
     * @return The eighth object
     */
    public T8 getT8() {
        return t8;
    }

    /**
     * Map the 1st part (T1) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T1 part
     * @param <R> the new type for the T1 part
     * @return a new {@link Tuple8} with a different T1 value
     */
    public <R> Tuple8<R, T2, T3, T4, T5, T6, T7, T8> mapT1(Function<T1, R> mapper) {
        return new Tuple8<>(mapper.apply(t1), t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Map the 2nd part (T2) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T2 part
     * @param <R> the new type for the T2 part
     * @return a new {@link Tuple8} with a different T2 value
     */
    public <R> Tuple8<T1, R, T3, T4, T5, T6, T7, T8> mapT2(Function<T2, R> mapper) {
        return new Tuple8<>(t1, mapper.apply(t2), t3, t4, t5, t6, t7, t8);
    }

    /**
     * Map the 3rd part (T3) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T3 part
     * @param <R> the new type for the T3 part
     * @return a new {@link Tuple8} with a different T3 value
     */
    public <R> Tuple8<T1, T2, R, T4, T5, T6, T7, T8> mapT3(Function<T3, R> mapper) {
        return new Tuple8<>(t1, t2, mapper.apply(t3), t4, t5, t6, t7, t8);
    }

    /**
     * Map the 4th part (T4) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T4 part
     * @param <R> the new type for the T4 part
     * @return a new {@link Tuple8} with a different T4 value
     */
    public <R> Tuple8<T1, T2, T3, R, T5, T6, T7, T8> mapT4(Function<T4, R> mapper) {
        return new Tuple8<>(t1, t2, t3, mapper.apply(t4), t5, t6, t7, t8);
    }

    /**
     * Map the 5th part (T5) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T5 part
     * @param <R> the new type for the T5 part
     * @return a new {@link Tuple8} with a different T5 value
     */
    public <R> Tuple8<T1, T2, T3, T4, R, T6, T7, T8> mapT5(Function<T5, R> mapper) {
        return new Tuple8<>(t1, t2, t3, t4, mapper.apply(t5), t6, t7, t8);
    }

    /**
     * Map the 6th part (T6) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T6 part
     * @param <R> the new type for the T6 part
     * @return a new {@link Tuple8} with a different T6 value
     */
    public <R> Tuple8<T1, T2, T3, T4, T5, R, T7, T8> mapT6(Function<T6, R> mapper) {
        return new Tuple8<>(t1, t2, t3, t4, t5, mapper.apply(t6), t7, t8);
    }

    /**
     * Map the 7th part (T7) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T7 part
     * @param <R> the new type for the T7 part
     * @return a new {@link Tuple8} with a different T7 value
     */
    public <R> Tuple8<T1, T2, T3, T4, T5, T6, R, T8> mapT7(Function<T7, R> mapper) {
        return new Tuple8<>(t1, t2, t3, t4, t5, t6, mapper.apply(t7), t8);
    }

    /**
     * Map the 8th part (t8) of this {@link Tuple8} into a different value and type,
     * keeping the other parts.
     *
     * @param mapper the mapping {@link Function} for the T8 part
     * @param <R> the new type for the T8 part
     * @return a new {@link Tuple8} with a different T8 value
     */
    public <R> Tuple8<T1, T2, T3, T4, T5, T6, T7, R> mapT8(Function<T8, R> mapper) {
        return new Tuple8<>(t1, t2, t3, t4, t5, t6, t7, mapper.apply(t8));
    }

    @Nullable @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return t1;
            case 1:
                return t2;
            case 2:
                return t3;
            case 3:
                return t4;
            case 4:
                return t5;
            case 5:
                return t6;
            case 6:
                return t7;
            case 7:
                return t8;
            default:
                return null;
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[] {t1, t2, t3, t4, t5, t6, t7, t8};
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof @SuppressWarnings("rawtypes") Tuple8 tuple8)) return false;
        if (!super.equals(o)) return false;

        return t8.equals(tuple8.t8);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + t8.hashCode();
        return result;
    }

    @Override
    public int size() {
        return 8;
    }
}
