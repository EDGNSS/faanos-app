// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeviceEnumsProto.proto

package org.onosproject.grpc.models;

public final class DeviceEnumsProto {
  private DeviceEnumsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code proto.DeviceTypeProto}
   */
  public enum DeviceTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OTHER = 0;</code>
     */
    OTHER(0),
    /**
     * <code>SWITCH = 1;</code>
     */
    SWITCH(1),
    /**
     * <code>ROUTER = 2;</code>
     */
    ROUTER(2),
    /**
     * <code>ROADM = 3;</code>
     */
    ROADM(3),
    /**
     * <code>OTN = 4;</code>
     */
    OTN(4),
    /**
     * <code>ROADM_OTN = 5;</code>
     */
    ROADM_OTN(5),
    /**
     * <code>FIREWALL = 6;</code>
     */
    FIREWALL(6),
    /**
     * <code>BALANCER = 7;</code>
     */
    BALANCER(7),
    /**
     * <code>IPS = 8;</code>
     */
    IPS(8),
    /**
     * <code>IDS = 9;</code>
     */
    IDS(9),
    /**
     * <code>CONTROLLER = 10;</code>
     */
    CONTROLLER(10),
    /**
     * <code>VIRTUAL_DEVICE = 11;</code>
     */
    VIRTUAL_DEVICE(11),
    /**
     * <code>FIBER_SWITCH = 12;</code>
     */
    FIBER_SWITCH(12),
    /**
     * <code>MICROWAVE = 13;</code>
     */
    MICROWAVE(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OTHER = 0;</code>
     */
    public static final int OTHER_VALUE = 0;
    /**
     * <code>SWITCH = 1;</code>
     */
    public static final int SWITCH_VALUE = 1;
    /**
     * <code>ROUTER = 2;</code>
     */
    public static final int ROUTER_VALUE = 2;
    /**
     * <code>ROADM = 3;</code>
     */
    public static final int ROADM_VALUE = 3;
    /**
     * <code>OTN = 4;</code>
     */
    public static final int OTN_VALUE = 4;
    /**
     * <code>ROADM_OTN = 5;</code>
     */
    public static final int ROADM_OTN_VALUE = 5;
    /**
     * <code>FIREWALL = 6;</code>
     */
    public static final int FIREWALL_VALUE = 6;
    /**
     * <code>BALANCER = 7;</code>
     */
    public static final int BALANCER_VALUE = 7;
    /**
     * <code>IPS = 8;</code>
     */
    public static final int IPS_VALUE = 8;
    /**
     * <code>IDS = 9;</code>
     */
    public static final int IDS_VALUE = 9;
    /**
     * <code>CONTROLLER = 10;</code>
     */
    public static final int CONTROLLER_VALUE = 10;
    /**
     * <code>VIRTUAL_DEVICE = 11;</code>
     */
    public static final int VIRTUAL_DEVICE_VALUE = 11;
    /**
     * <code>FIBER_SWITCH = 12;</code>
     */
    public static final int FIBER_SWITCH_VALUE = 12;
    /**
     * <code>MICROWAVE = 13;</code>
     */
    public static final int MICROWAVE_VALUE = 13;


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
    public static DeviceTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static DeviceTypeProto forNumber(int value) {
      switch (value) {
        case 0: return OTHER;
        case 1: return SWITCH;
        case 2: return ROUTER;
        case 3: return ROADM;
        case 4: return OTN;
        case 5: return ROADM_OTN;
        case 6: return FIREWALL;
        case 7: return BALANCER;
        case 8: return IPS;
        case 9: return IDS;
        case 10: return CONTROLLER;
        case 11: return VIRTUAL_DEVICE;
        case 12: return FIBER_SWITCH;
        case 13: return MICROWAVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeviceTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DeviceTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceTypeProto>() {
            public DeviceTypeProto findValueByNumber(int number) {
              return DeviceTypeProto.forNumber(number);
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
      return org.onosproject.grpc.models.DeviceEnumsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final DeviceTypeProto[] VALUES = values();

    public static DeviceTypeProto valueOf(
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

    private DeviceTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.DeviceTypeProto)
  }

  /**
   * Protobuf enum {@code proto.DeviceEventTypeProto}
   */
  public enum DeviceEventTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEVICE_ADDED = 0;</code>
     */
    DEVICE_ADDED(0),
    /**
     * <code>DEVICE_UPDATED = 1;</code>
     */
    DEVICE_UPDATED(1),
    /**
     * <code>DEVICE_REMOVED = 2;</code>
     */
    DEVICE_REMOVED(2),
    /**
     * <code>DEVICE_SUSPENDED = 3;</code>
     */
    DEVICE_SUSPENDED(3),
    /**
     * <code>DEVICE_AVAILABILITY_CHANGED = 4;</code>
     */
    DEVICE_AVAILABILITY_CHANGED(4),
    /**
     * <code>PORT_ADDED = 5;</code>
     */
    PORT_ADDED(5),
    /**
     * <code>PORT_UPDATED = 6;</code>
     */
    PORT_UPDATED(6),
    /**
     * <code>PORT_REMOVED = 7;</code>
     */
    PORT_REMOVED(7),
    /**
     * <code>PORT_STATS_UPDATED = 8;</code>
     */
    PORT_STATS_UPDATED(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DEVICE_ADDED = 0;</code>
     */
    public static final int DEVICE_ADDED_VALUE = 0;
    /**
     * <code>DEVICE_UPDATED = 1;</code>
     */
    public static final int DEVICE_UPDATED_VALUE = 1;
    /**
     * <code>DEVICE_REMOVED = 2;</code>
     */
    public static final int DEVICE_REMOVED_VALUE = 2;
    /**
     * <code>DEVICE_SUSPENDED = 3;</code>
     */
    public static final int DEVICE_SUSPENDED_VALUE = 3;
    /**
     * <code>DEVICE_AVAILABILITY_CHANGED = 4;</code>
     */
    public static final int DEVICE_AVAILABILITY_CHANGED_VALUE = 4;
    /**
     * <code>PORT_ADDED = 5;</code>
     */
    public static final int PORT_ADDED_VALUE = 5;
    /**
     * <code>PORT_UPDATED = 6;</code>
     */
    public static final int PORT_UPDATED_VALUE = 6;
    /**
     * <code>PORT_REMOVED = 7;</code>
     */
    public static final int PORT_REMOVED_VALUE = 7;
    /**
     * <code>PORT_STATS_UPDATED = 8;</code>
     */
    public static final int PORT_STATS_UPDATED_VALUE = 8;


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
    public static DeviceEventTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static DeviceEventTypeProto forNumber(int value) {
      switch (value) {
        case 0: return DEVICE_ADDED;
        case 1: return DEVICE_UPDATED;
        case 2: return DEVICE_REMOVED;
        case 3: return DEVICE_SUSPENDED;
        case 4: return DEVICE_AVAILABILITY_CHANGED;
        case 5: return PORT_ADDED;
        case 6: return PORT_UPDATED;
        case 7: return PORT_REMOVED;
        case 8: return PORT_STATS_UPDATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeviceEventTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DeviceEventTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceEventTypeProto>() {
            public DeviceEventTypeProto findValueByNumber(int number) {
              return DeviceEventTypeProto.forNumber(number);
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
      return org.onosproject.grpc.models.DeviceEnumsProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final DeviceEventTypeProto[] VALUES = values();

    public static DeviceEventTypeProto valueOf(
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

    private DeviceEventTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.DeviceEventTypeProto)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DeviceEnumsProto.proto\022\005proto*\312\001\n\017Devi" +
      "ceTypeProto\022\t\n\005OTHER\020\000\022\n\n\006SWITCH\020\001\022\n\n\006RO" +
      "UTER\020\002\022\t\n\005ROADM\020\003\022\007\n\003OTN\020\004\022\r\n\tROADM_OTN\020" +
      "\005\022\014\n\010FIREWALL\020\006\022\014\n\010BALANCER\020\007\022\007\n\003IPS\020\010\022\007" +
      "\n\003IDS\020\t\022\016\n\nCONTROLLER\020\n\022\022\n\016VIRTUAL_DEVIC" +
      "E\020\013\022\020\n\014FIBER_SWITCH\020\014\022\r\n\tMICROWAVE\020\r*\323\001\n" +
      "\024DeviceEventTypeProto\022\020\n\014DEVICE_ADDED\020\000\022" +
      "\022\n\016DEVICE_UPDATED\020\001\022\022\n\016DEVICE_REMOVED\020\002\022" +
      "\024\n\020DEVICE_SUSPENDED\020\003\022\037\n\033DEVICE_AVAILABI" +
      "LITY_CHANGED\020\004\022\016\n\nPORT_ADDED\020\005\022\020\n\014PORT_U" +
      "PDATED\020\006\022\020\n\014PORT_REMOVED\020\007\022\026\n\022PORT_STATS" +
      "_UPDATED\020\010B\035\n\033org.onosproject.grpc.model" +
      "sb\006proto3"
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