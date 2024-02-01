package com.badlogic.gdx.jnigen.gc;

import com.badlogic.gdx.jnigen.closure.Closure;
import com.badlogic.gdx.jnigen.closure.ClosureObject;
import com.badlogic.gdx.jnigen.ffi.JavaTypeWrapper;
import com.badlogic.gdx.jnigen.pointer.CType;

public class Closures {

    /*JNI
        #include "definitions.h"
     */

    public interface CallbackNoReturnNoArg extends Closure {
        void toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall();
        }
    }

    public interface CallbackNoReturnLongArg extends Closure {
        void toCall(@CType("uint64_t") long arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asLong());
        }
    }

    public interface CallbackNoReturnIntArg extends Closure {
        void toCall(@CType("uint32_t") int arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asInt());
        }
    }


    public interface CallbackNoReturnShortArg extends Closure {
        void toCall(@CType("uint16_t") short arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asShort());
        }
    }

    public interface CallbackNoReturnShortUpcastArg extends Closure {
        void toCall(@CType("uint16_t") int arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asInt());
        }
    }

    public interface CallbackNoReturnByteArg extends Closure {
        void toCall(@CType("uint8_t") byte arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asByte());
        }
    }

    public interface CallbackNoReturnCharArg extends Closure {
        void toCall(@CType("uint16_t") char arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asChar());
        }
    }

    public interface CallbackNoReturnBooleanArg extends Closure {
        void toCall(@CType("uint8_t") boolean arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asBoolean());
        }
    }

    public interface CallbackNoReturnFloatArg extends Closure {
        void toCall(@CType("float") float arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asFloat());
        }
    }

    public interface CallbackNoReturnDoubleArg extends Closure {
        void toCall(@CType("double") double arg);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asDouble());
        }
    }

    public interface CallbackNoReturnAllArgs extends Closure {
        void toCall(@CType("uint64_t") long arg1, @CType("uint32_t") int arg2, @CType("uint16_t") short arg3,
                @CType("uint8_t") byte arg4, @CType("uint16_t") char arg5, @CType("uint8_t") boolean arg6,
                @CType("float") float arg7, @CType("double") double arg8);

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            toCall(parameters[0].asLong(), parameters[1].asInt(), parameters[2].asShort(),
                    parameters[3].asByte(), parameters[4].asChar(), parameters[5].asBoolean(), parameters[6].asFloat(),
                    parameters[7].asDouble());
        }
    }

    public interface CallbackLongReturnNoArg extends Closure {
        @CType("uint64_t")
        long toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackIntReturnNoArg extends Closure {
        @CType("uint32_t")
        int toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackShortReturnNoArg extends Closure {
        @CType("uint16_t")
        short toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackCharReturnNoArg extends Closure {
        @CType("uint16_t")
        char toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackByteReturnNoArg extends Closure {
        @CType("uint8_t")
        byte toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackBooleanReturnNoArg extends Closure {
        @CType("uint8_t")
        boolean toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall() ? 1 : 0);
        }
    }

    public interface CallbackFloatReturnNoArg extends Closure {
        @CType("float")
        float toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public interface CallbackDoubleReturnNoArg extends Closure {
        @CType("double")
        double toCall();

        @Override
        default void invoke(JavaTypeWrapper[] parameters, JavaTypeWrapper returnType) {
            returnType.setValue(toCall());
        }
    }

    public static void methodWithCallback(ClosureObject<CallbackNoReturnNoArg> closure) {
        methodWithCallback(closure.getFnPtr());
    }

    private static native void methodWithCallback(long fnPtr);/*
        ((void (*)())fnPtr)();
    */

    public static native void methodWithCallbackLongArg(long fnPtr);/*
        uint64_t arg = 5;
        ((void (*)(uint64_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackIntArg(long fnPtr);/*
        uint32_t arg = 5;
        ((void (*)(uint32_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackShortArg(long fnPtr);/*
        uint16_t arg = 5;
        ((void (*)(uint16_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackShortUpcastArg(long fnPtr);/*
        uint16_t arg = 65535;
        ((void (*)(uint16_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackByteArg(long fnPtr);/*
        uint8_t arg = 5;
        ((void (*)(uint8_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackCharArg(long fnPtr);/*
        uint16_t arg = 5;
        ((void (*)(uint16_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackBooleanArg(long fnPtr);/*
        bool arg = true;
        ((void (*)(bool))fnPtr)(arg);
    */

    public static native void methodWithCallbackFloatArg(long fnPtr);/*
        float arg = 5.5;
        ((void (*)(float))fnPtr)(arg);
    */

    public static native void methodWithCallbackDoubleArg(long fnPtr);/*
        double arg = 5.5;
        ((void (*)(double))fnPtr)(arg);
    */

    public static native void methodWithCallbackStructArg(long fnPtr);/*
        TestStruct arg = {
            .field1 = 1,
            .field2 = 2,
            .field3 = 3,
            .field4 = 4
        };
        ((void (*)(TestStruct))fnPtr)(arg);
    */

    public static native void methodWithCallbackStructPointerArg(long fnPtr);/*
        TestStruct str = {
            .field1 = 1,
            .field2 = 2,
            .field3 = 3,
            .field4 = 4
        };
        TestStruct* arg = (TestStruct*) malloc(sizeof(TestStruct));
        *arg = str;
        ((void (*)(TestStruct*))fnPtr)(arg);
    */

    public static native void methodWithCallbackAllArgs(long fnPtr);/*
        uint64_t arg1 = 1;
        uint32_t arg2 = 2;
        uint16_t arg3 = 3;
        uint8_t arg4 = 4;
        uint16_t arg5 = 5;
        bool arg6 = true;
        float arg7 = 6.6;
        double arg8 = 7.7;
        ((void (*)(uint64_t, uint32_t, uint16_t, uint8_t, uint16_t, bool, float, double))fnPtr)(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    */

    public static native long methodWithCallbackLongReturn(long fnPtr);/*
        return ((uint64_t (*)())fnPtr)();
    */

    public static native int methodWithCallbackIntReturn(long fnPtr);/*
        return ((uint32_t (*)())fnPtr)();
    */

    public static native short methodWithCallbackShortReturn(long fnPtr);/*
        return ((uint16_t (*)())fnPtr)();
    */

    public static native char methodWithCallbackCharReturn(long fnPtr);/*
        return ((uint16_t (*)())fnPtr)();
    */

    public static native byte methodWithCallbackByteReturn(long fnPtr);/*
        return ((uint8_t (*)())fnPtr)();
    */

    public static native boolean methodWithCallbackBooleanReturn(long fnPtr);/*
        return ((uint8_t (*)())fnPtr)() == 1;
    */

    public static native float methodWithCallbackFloatReturn(long fnPtr);/*
        return ((float (*)())fnPtr)();
    */

    public static native double methodWithCallbackDoubleReturn(long fnPtr);/*
        return ((double (*)())fnPtr)();
    */
}