/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * A TRowMutations object is used to apply a number of Mutations to a single row.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-04-16")
public class TRowMutations implements org.apache.thrift.TBase<TRowMutations, TRowMutations._Fields>, java.io.Serializable, Cloneable, Comparable<TRowMutations> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRowMutations");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MUTATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("mutations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRowMutationsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRowMutationsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TMutation> mutations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    MUTATIONS((short)2, "mutations");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // MUTATIONS
          return MUTATIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MUTATIONS, new org.apache.thrift.meta_data.FieldMetaData("mutations", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMutation.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRowMutations.class, metaDataMap);
  }

  public TRowMutations() {
  }

  public TRowMutations(
    java.nio.ByteBuffer row,
    java.util.List<TMutation> mutations)
  {
    this();
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    this.mutations = mutations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRowMutations(TRowMutations other) {
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
    }
    if (other.isSetMutations()) {
      java.util.List<TMutation> __this__mutations = new java.util.ArrayList<TMutation>(other.mutations.size());
      for (TMutation other_element : other.mutations) {
        __this__mutations.add(new TMutation(other_element));
      }
      this.mutations = __this__mutations;
    }
  }

  public TRowMutations deepCopy() {
    return new TRowMutations(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.mutations = null;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public java.nio.ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TRowMutations setRow(byte[] row) {
    this.row = row == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(row.clone());
    return this;
  }

  public TRowMutations setRow(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getMutationsSize() {
    return (this.mutations == null) ? 0 : this.mutations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TMutation> getMutationsIterator() {
    return (this.mutations == null) ? null : this.mutations.iterator();
  }

  public void addToMutations(TMutation elem) {
    if (this.mutations == null) {
      this.mutations = new java.util.ArrayList<TMutation>();
    }
    this.mutations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TMutation> getMutations() {
    return this.mutations;
  }

  public TRowMutations setMutations(@org.apache.thrift.annotation.Nullable java.util.List<TMutation> mutations) {
    this.mutations = mutations;
    return this;
  }

  public void unsetMutations() {
    this.mutations = null;
  }

  /** Returns true if field mutations is set (has been assigned a value) and false otherwise */
  public boolean isSetMutations() {
    return this.mutations != null;
  }

  public void setMutationsIsSet(boolean value) {
    if (!value) {
      this.mutations = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        if (value instanceof byte[]) {
          setRow((byte[])value);
        } else {
          setRow((java.nio.ByteBuffer)value);
        }
      }
      break;

    case MUTATIONS:
      if (value == null) {
        unsetMutations();
      } else {
        setMutations((java.util.List<TMutation>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case MUTATIONS:
      return getMutations();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case MUTATIONS:
      return isSetMutations();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TRowMutations)
      return this.equals((TRowMutations)that);
    return false;
  }

  public boolean equals(TRowMutations that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_mutations = true && this.isSetMutations();
    boolean that_present_mutations = true && that.isSetMutations();
    if (this_present_mutations || that_present_mutations) {
      if (!(this_present_mutations && that_present_mutations))
        return false;
      if (!this.mutations.equals(that.mutations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRow()) ? 131071 : 524287);
    if (isSetRow())
      hashCode = hashCode * 8191 + row.hashCode();

    hashCode = hashCode * 8191 + ((isSetMutations()) ? 131071 : 524287);
    if (isSetMutations())
      hashCode = hashCode * 8191 + mutations.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRowMutations other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRow()).compareTo(other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMutations()).compareTo(other.isSetMutations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMutations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mutations, other.mutations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRowMutations(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mutations:");
    if (this.mutations == null) {
      sb.append("null");
    } else {
      sb.append(this.mutations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (row == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row' was not present! Struct: " + toString());
    }
    if (mutations == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'mutations' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRowMutationsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRowMutationsStandardScheme getScheme() {
      return new TRowMutationsStandardScheme();
    }
  }

  private static class TRowMutationsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRowMutations> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRowMutations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MUTATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.mutations = new java.util.ArrayList<TMutation>(_list134.size);
                @org.apache.thrift.annotation.Nullable TMutation _elem135;
                for (int _i136 = 0; _i136 < _list134.size; ++_i136)
                {
                  _elem135 = new TMutation();
                  _elem135.read(iprot);
                  struct.mutations.add(_elem135);
                }
                iprot.readListEnd();
              }
              struct.setMutationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRowMutations struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.mutations != null) {
        oprot.writeFieldBegin(MUTATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.mutations.size()));
          for (TMutation _iter137 : struct.mutations)
          {
            _iter137.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRowMutationsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRowMutationsTupleScheme getScheme() {
      return new TRowMutationsTupleScheme();
    }
  }

  private static class TRowMutationsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRowMutations> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRowMutations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBinary(struct.row);
      {
        oprot.writeI32(struct.mutations.size());
        for (TMutation _iter138 : struct.mutations)
        {
          _iter138.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRowMutations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.row = iprot.readBinary();
      struct.setRowIsSet(true);
      {
        org.apache.thrift.protocol.TList _list139 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.mutations = new java.util.ArrayList<TMutation>(_list139.size);
        @org.apache.thrift.annotation.Nullable TMutation _elem140;
        for (int _i141 = 0; _i141 < _list139.size; ++_i141)
        {
          _elem140 = new TMutation();
          _elem140.read(iprot);
          struct.mutations.add(_elem140);
        }
      }
      struct.setMutationsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

