/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zero.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * *********投放单的检索结果**********
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-02-24")
public class SearchResp implements org.apache.thrift.TBase<SearchResp, SearchResp._Fields>, java.io.Serializable, Cloneable, Comparable<SearchResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchResp");

  private static final org.apache.thrift.protocol.TField ADUNIT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("adunitId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LINEITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("lineitems", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SearchRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SearchRespTupleSchemeFactory());
  }

  public String adunitId; // required
  public List<LineitemResp> lineitems; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADUNIT_ID((short)1, "adunitId"),
    LINEITEMS((short)2, "lineitems");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ADUNIT_ID
          return ADUNIT_ID;
        case 2: // LINEITEMS
          return LINEITEMS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADUNIT_ID, new org.apache.thrift.meta_data.FieldMetaData("adunitId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINEITEMS, new org.apache.thrift.meta_data.FieldMetaData("lineitems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "LineitemResp"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchResp.class, metaDataMap);
  }

  public SearchResp() {
  }

  public SearchResp(
    String adunitId,
    List<LineitemResp> lineitems)
  {
    this();
    this.adunitId = adunitId;
    this.lineitems = lineitems;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchResp(SearchResp other) {
    if (other.isSetAdunitId()) {
      this.adunitId = other.adunitId;
    }
    if (other.isSetLineitems()) {
      List<LineitemResp> __this__lineitems = new ArrayList<LineitemResp>(other.lineitems.size());
      for (LineitemResp other_element : other.lineitems) {
        __this__lineitems.add(other_element);
      }
      this.lineitems = __this__lineitems;
    }
  }

  public SearchResp deepCopy() {
    return new SearchResp(this);
  }

  @Override
  public void clear() {
    this.adunitId = null;
    this.lineitems = null;
  }

  public String getAdunitId() {
    return this.adunitId;
  }

  public SearchResp setAdunitId(String adunitId) {
    this.adunitId = adunitId;
    return this;
  }

  public void unsetAdunitId() {
    this.adunitId = null;
  }

  /** Returns true if field adunitId is set (has been assigned a value) and false otherwise */
  public boolean isSetAdunitId() {
    return this.adunitId != null;
  }

  public void setAdunitIdIsSet(boolean value) {
    if (!value) {
      this.adunitId = null;
    }
  }

  public int getLineitemsSize() {
    return (this.lineitems == null) ? 0 : this.lineitems.size();
  }

  public java.util.Iterator<LineitemResp> getLineitemsIterator() {
    return (this.lineitems == null) ? null : this.lineitems.iterator();
  }

  public void addToLineitems(LineitemResp elem) {
    if (this.lineitems == null) {
      this.lineitems = new ArrayList<LineitemResp>();
    }
    this.lineitems.add(elem);
  }

  public List<LineitemResp> getLineitems() {
    return this.lineitems;
  }

  public SearchResp setLineitems(List<LineitemResp> lineitems) {
    this.lineitems = lineitems;
    return this;
  }

  public void unsetLineitems() {
    this.lineitems = null;
  }

  /** Returns true if field lineitems is set (has been assigned a value) and false otherwise */
  public boolean isSetLineitems() {
    return this.lineitems != null;
  }

  public void setLineitemsIsSet(boolean value) {
    if (!value) {
      this.lineitems = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADUNIT_ID:
      if (value == null) {
        unsetAdunitId();
      } else {
        setAdunitId((String)value);
      }
      break;

    case LINEITEMS:
      if (value == null) {
        unsetLineitems();
      } else {
        setLineitems((List<LineitemResp>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADUNIT_ID:
      return getAdunitId();

    case LINEITEMS:
      return getLineitems();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADUNIT_ID:
      return isSetAdunitId();
    case LINEITEMS:
      return isSetLineitems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchResp)
      return this.equals((SearchResp)that);
    return false;
  }

  public boolean equals(SearchResp that) {
    if (that == null)
      return false;

    boolean this_present_adunitId = true && this.isSetAdunitId();
    boolean that_present_adunitId = true && that.isSetAdunitId();
    if (this_present_adunitId || that_present_adunitId) {
      if (!(this_present_adunitId && that_present_adunitId))
        return false;
      if (!this.adunitId.equals(that.adunitId))
        return false;
    }

    boolean this_present_lineitems = true && this.isSetLineitems();
    boolean that_present_lineitems = true && that.isSetLineitems();
    if (this_present_lineitems || that_present_lineitems) {
      if (!(this_present_lineitems && that_present_lineitems))
        return false;
      if (!this.lineitems.equals(that.lineitems))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_adunitId = true && (isSetAdunitId());
    list.add(present_adunitId);
    if (present_adunitId)
      list.add(adunitId);

    boolean present_lineitems = true && (isSetLineitems());
    list.add(present_lineitems);
    if (present_lineitems)
      list.add(lineitems);

    return list.hashCode();
  }

  @Override
  public int compareTo(SearchResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAdunitId()).compareTo(other.isSetAdunitId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdunitId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adunitId, other.adunitId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLineitems()).compareTo(other.isSetLineitems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLineitems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lineitems, other.lineitems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SearchResp(");
    boolean first = true;

    sb.append("adunitId:");
    if (this.adunitId == null) {
      sb.append("null");
    } else {
      sb.append(this.adunitId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lineitems:");
    if (this.lineitems == null) {
      sb.append("null");
    } else {
      sb.append(this.lineitems);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SearchRespStandardSchemeFactory implements SchemeFactory {
    public SearchRespStandardScheme getScheme() {
      return new SearchRespStandardScheme();
    }
  }

  private static class SearchRespStandardScheme extends StandardScheme<SearchResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADUNIT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.adunitId = iprot.readString();
              struct.setAdunitIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LINEITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.lineitems = new ArrayList<LineitemResp>(_list8.size);
                LineitemResp _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new LineitemResp();
                  _elem9.read(iprot);
                  struct.lineitems.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setLineitemsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.adunitId != null) {
        oprot.writeFieldBegin(ADUNIT_ID_FIELD_DESC);
        oprot.writeString(struct.adunitId);
        oprot.writeFieldEnd();
      }
      if (struct.lineitems != null) {
        oprot.writeFieldBegin(LINEITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.lineitems.size()));
          for (LineitemResp _iter11 : struct.lineitems)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchRespTupleSchemeFactory implements SchemeFactory {
    public SearchRespTupleScheme getScheme() {
      return new SearchRespTupleScheme();
    }
  }

  private static class SearchRespTupleScheme extends TupleScheme<SearchResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAdunitId()) {
        optionals.set(0);
      }
      if (struct.isSetLineitems()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAdunitId()) {
        oprot.writeString(struct.adunitId);
      }
      if (struct.isSetLineitems()) {
        {
          oprot.writeI32(struct.lineitems.size());
          for (LineitemResp _iter12 : struct.lineitems)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.adunitId = iprot.readString();
        struct.setAdunitIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.lineitems = new ArrayList<LineitemResp>(_list13.size);
          LineitemResp _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new LineitemResp();
            _elem14.read(iprot);
            struct.lineitems.add(_elem14);
          }
        }
        struct.setLineitemsIsSet(true);
      }
    }
  }

}

