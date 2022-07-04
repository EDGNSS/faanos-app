// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MeterEnumsProto.proto

package org.onosproject.grpc.models;

public final class MeterEnumsProto {
  private MeterEnumsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code proto.MeterUnitProto}
   */
  public enum MeterUnitProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     **
     * Packets per second.
     * </pre>
     *
     * <code>PKTS_PER_SEC = 0;</code>
     */
    PKTS_PER_SEC(0),
    /**
     * <pre>
     **
     * Kilo bits per second.
     * </pre>
     *
     * <code>KB_PER_SEC = 1;</code>
     */
    KB_PER_SEC(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     **
     * Packets per second.
     * </pre>
     *
     * <code>PKTS_PER_SEC = 0;</code>
     */
    public static final int PKTS_PER_SEC_VALUE = 0;
    /**
     * <pre>
     **
     * Kilo bits per second.
     * </pre>
     *
     * <code>KB_PER_SEC = 1;</code>
     */
    public static final int KB_PER_SEC_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MeterUnitProto valueOf(int value) {
      return forNumber(value);
    }

    public static MeterUnitProto forNumber(int value) {
      switch (value) {
        case 0: return PKTS_PER_SEC;
        case 1: return KB_PER_SEC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeterUnitProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeterUnitProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeterUnitProto>() {
            public MeterUnitProto findValueByNumber(int number) {
              return MeterUnitProto.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.onosproject.grpc.models.MeterEnumsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final MeterUnitProto[] VALUES = values();

    public static MeterUnitProto valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MeterUnitProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.MeterUnitProto)
  }

  /**
   * Protobuf enum {@code proto.MeterStateProto}
   */
  public enum MeterStateProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     **
     * The meter is in the process of being added.
     * </pre>
     *
     * <code>PENDING_ADD = 0;</code>
     */
    PENDING_ADD(0),
    /**
     * <pre>
     **
     * THe meter has been added.
     * </pre>
     *
     * <code>ADDED = 1;</code>
     */
    ADDED(1),
    /**
     * <pre>
     **
     * The meter is in the process of being removed.
     * </pre>
     *
     * <code>PENDING_REMOVE = 2;</code>
     */
    PENDING_REMOVE(2),
    /**
     * <pre>
     **
     * The meter has been removed.
     * </pre>
     *
     * <code>REMOVED = 3;</code>
     */
    REMOVED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     **
     * The meter is in the process of being added.
     * </pre>
     *
     * <code>PENDING_ADD = 0;</code>
     */
    public static final int PENDING_ADD_VALUE = 0;
    /**
     * <pre>
     **
     * THe meter has been added.
     * </pre>
     *
     * <code>ADDED = 1;</code>
     */
    public static final int ADDED_VALUE = 1;
    /**
     * <pre>
     **
     * The meter is in the process of being removed.
     * </pre>
     *
     * <code>PENDING_REMOVE = 2;</code>
     */
    public static final int PENDING_REMOVE_VALUE = 2;
    /**
     * <pre>
     **
     * The meter has been removed.
     * </pre>
     *
     * <code>REMOVED = 3;</code>
     */
    public static final int REMOVED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MeterStateProto valueOf(int value) {
      return forNumber(value);
    }

    public static MeterStateProto forNumber(int value) {
      switch (value) {
        case 0: return PENDING_ADD;
        case 1: return ADDED;
        case 2: return PENDING_REMOVE;
        case 3: return REMOVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeterStateProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeterStateProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeterStateProto>() {
            public MeterStateProto findValueByNumber(int number) {
              return MeterStateProto.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.onosproject.grpc.models.MeterEnumsProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final MeterStateProto[] VALUES = values();

    public static MeterStateProto valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MeterStateProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.MeterStateProto)
  }

  /**
   * Protobuf enum {@code proto.MeterRequestTypeProto}
   */
  public enum MeterRequestTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ADD = 0;</code>
     */
    ADD(0),
    /**
     * <code>MODIFY = 1;</code>
     */
    MODIFY(1),
    /**
     * <code>REMOVE = 2;</code>
     */
    REMOVE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ADD = 0;</code>
     */
    public static final int ADD_VALUE = 0;
    /**
     * <code>MODIFY = 1;</code>
     */
    public static final int MODIFY_VALUE = 1;
    /**
     * <code>REMOVE = 2;</code>
     */
    public static final int REMOVE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MeterRequestTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static MeterRequestTypeProto forNumber(int value) {
      switch (value) {
        case 0: return ADD;
        case 1: return MODIFY;
        case 2: return REMOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeterRequestTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeterRequestTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeterRequestTypeProto>() {
            public MeterRequestTypeProto findValueByNumber(int number) {
              return MeterRequestTypeProto.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.onosproject.grpc.models.MeterEnumsProto.getDescriptor().getEnumTypes().get(2);
    }

    private static final MeterRequestTypeProto[] VALUES = values();

    public static MeterRequestTypeProto valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MeterRequestTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.MeterRequestTypeProto)
  }

  /**
   * Protobuf enum {@code proto.MeterEventTypeProto}
   */
  public enum MeterEventTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     **
     * A meter addition was requested.
     * </pre>
     *
     * <code>METER_ADD_REQ = 0;</code>
     */
    METER_ADD_REQ(0),
    /**
     * <pre>
     **
     * A meter removal was requested.
     * </pre>
     *
     * <code>METER_REM_REQ = 1;</code>
     */
    METER_REM_REQ(1),
    /**
     * <pre>
     **
     * A meter was finally added to device.
     * </pre>
     *
     * <code>METER_ADDED = 2;</code>
     */
    METER_ADDED(2),
    /**
     * <pre>
     **
     * A meter was finally removed from device.
     * </pre>
     *
     * <code>METER_REMOVED = 3;</code>
     */
    METER_REMOVED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     **
     * A meter addition was requested.
     * </pre>
     *
     * <code>METER_ADD_REQ = 0;</code>
     */
    public static final int METER_ADD_REQ_VALUE = 0;
    /**
     * <pre>
     **
     * A meter removal was requested.
     * </pre>
     *
     * <code>METER_REM_REQ = 1;</code>
     */
    public static final int METER_REM_REQ_VALUE = 1;
    /**
     * <pre>
     **
     * A meter was finally added to device.
     * </pre>
     *
     * <code>METER_ADDED = 2;</code>
     */
    public static final int METER_ADDED_VALUE = 2;
    /**
     * <pre>
     **
     * A meter was finally removed from device.
     * </pre>
     *
     * <code>METER_REMOVED = 3;</code>
     */
    public static final int METER_REMOVED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MeterEventTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static MeterEventTypeProto forNumber(int value) {
      switch (value) {
        case 0: return METER_ADD_REQ;
        case 1: return METER_REM_REQ;
        case 2: return METER_ADDED;
        case 3: return METER_REMOVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MeterEventTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MeterEventTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MeterEventTypeProto>() {
            public MeterEventTypeProto findValueByNumber(int number) {
              return MeterEventTypeProto.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.onosproject.grpc.models.MeterEnumsProto.getDescriptor().getEnumTypes().get(3);
    }

    private static final MeterEventTypeProto[] VALUES = values();

    public static MeterEventTypeProto valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MeterEventTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.MeterEventTypeProto)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MeterEnumsProto.proto\022\005proto*2\n\016MeterU" +
      "nitProto\022\020\n\014PKTS_PER_SEC\020\000\022\016\n\nKB_PER_SEC" +
      "\020\001*N\n\017MeterStateProto\022\017\n\013PENDING_ADD\020\000\022\t" +
      "\n\005ADDED\020\001\022\022\n\016PENDING_REMOVE\020\002\022\013\n\007REMOVED" +
      "\020\003*8\n\025MeterRequestTypeProto\022\007\n\003ADD\020\000\022\n\n\006" +
      "MODIFY\020\001\022\n\n\006REMOVE\020\002*_\n\023MeterEventTypePr" +
      "oto\022\021\n\rMETER_ADD_REQ\020\000\022\021\n\rMETER_REM_REQ\020" +
      "\001\022\017\n\013METER_ADDED\020\002\022\021\n\rMETER_REMOVED\020\003B\035\n" +
      "\033org.onosproject.grpc.modelsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}