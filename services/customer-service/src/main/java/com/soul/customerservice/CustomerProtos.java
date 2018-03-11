package com.soul.customerservice;

public final class CustomerProtos {

    private CustomerProtos() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface CustomerOrBuilder extends
            com.google.protobuf.MessageOrBuilder {

        // optional int64 id = 1;
        /**
         * <code>optional int64 id = 1;</code>
         */
        boolean hasId();

        /**
         * <code>optional int64 id = 1;</code>
         */
        long getId();

        // required string firstName = 2;
        /**
         * <code>required string firstName = 2;</code>
         */
        boolean hasFirstName();

        /**
         * <code>required string firstName = 2;</code>
         */
        java.lang.String getFirstName();

        /**
         * <code>required string firstName = 2;</code>
         */
        com.google.protobuf.ByteString getFirstNameBytes();

        // required string lastName = 3;
        /**
         * <code>required string lastName = 3;</code>
         */
        boolean hasLastName();

        /**
         * <code>required string lastName = 3;</code>
         */
        java.lang.String getLastName();

        /**
         * <code>required string lastName = 3;</code>
         */
        com.google.protobuf.ByteString getLastNameBytes();
    }

    /**
     * Protobuf type {@code com.soul.customerservice.Customer}
     */
    public static final class Customer extends
            com.google.protobuf.GeneratedMessage implements CustomerOrBuilder {

        // Use Customer.newBuilder() to
        // construct.
        private Customer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Customer(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet
                    .getDefaultInstance();
        }

        private static final Customer defaultInstance;

        public static Customer getDefaultInstance() {
            return defaultInstance;
        }

        public Customer getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Customer(com.google.protobuf.CodedInputStream input,
                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
                    .newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            firstName_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            lastName_ = input.readBytes();
                            break;
                        }
                    }
                }
            }
            catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
                        .setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return CustomerProtos.internal_static_com_soul_customerservice_Customer_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customer_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.soul.customerservice.CustomerProtos.Customer.class,
                            com.soul.customerservice.CustomerProtos.Customer.Builder.class);
        }

        public static com.google.protobuf.Parser<Customer> PARSER = new com.google.protobuf.AbstractParser<Customer>() {

            public Customer parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Customer(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<Customer> getParserForType() {
            return PARSER;
        }

        private int bitField0_;

        // optional int64 id = 1;
        public static final int ID_FIELD_NUMBER = 1;

        private long id_;

        /**
         * <code>optional int64 id = 1;</code>
         */
        public boolean hasId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        // required string firstName = 2;
        public static final int FIRSTNAME_FIELD_NUMBER = 2;

        private java.lang.Object firstName_;

        /**
         * <code>required string firstName = 2;</code>
         */
        public boolean hasFirstName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required string firstName = 2;</code>
         */
        public java.lang.String getFirstName() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            }
            else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    firstName_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string firstName = 2;</code>
         */
        public com.google.protobuf.ByteString getFirstNameBytes() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                        .copyFromUtf8((java.lang.String) ref);
                firstName_ = b;
                return b;
            }
            else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string lastName = 3;
        public static final int LASTNAME_FIELD_NUMBER = 3;

        private java.lang.Object lastName_;

        /**
         * <code>required string lastName = 3;</code>
         */
        public boolean hasLastName() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>required string lastName = 3;</code>
         */
        public java.lang.String getLastName() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            }
            else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    lastName_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string lastName = 3;</code>
         */
        public com.google.protobuf.ByteString getLastNameBytes() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                        .copyFromUtf8((java.lang.String) ref);
                lastName_ = b;
                return b;
            }
            else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            id_ = 0L;
            firstName_ = "";
            lastName_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            if (!hasFirstName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLastName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt64(1, id_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getFirstNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getLastNameBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, id_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(2,
                        getFirstNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(3,
                        getLastNameBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(byte[] data,
                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customer parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.soul.customerservice.CustomerProtos.Customer prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code com.soul.customerservice.Customer}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                com.soul.customerservice.CustomerProtos.CustomerOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customer_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customer_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(com.soul.customerservice.CustomerProtos.Customer.class,
                                com.soul.customerservice.CustomerProtos.Customer.Builder.class);
            }

            // Construct using
            // com.soul.customerservice.CustomerProtos.Customer.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                id_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                firstName_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                lastName_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customer_descriptor;
            }

            public com.soul.customerservice.CustomerProtos.Customer getDefaultInstanceForType() {
                return com.soul.customerservice.CustomerProtos.Customer.getDefaultInstance();
            }

            public com.soul.customerservice.CustomerProtos.Customer build() {
                com.soul.customerservice.CustomerProtos.Customer result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.soul.customerservice.CustomerProtos.Customer buildPartial() {
                com.soul.customerservice.CustomerProtos.Customer result = new com.soul.customerservice.CustomerProtos.Customer(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.id_ = id_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.firstName_ = firstName_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lastName_ = lastName_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.soul.customerservice.CustomerProtos.Customer) {
                    return mergeFrom((com.soul.customerservice.CustomerProtos.Customer) other);
                }
                else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.soul.customerservice.CustomerProtos.Customer other) {
                if (other == com.soul.customerservice.CustomerProtos.Customer.getDefaultInstance())
                    return this;
                if (other.hasId()) {
                    setId(other.getId());
                }
                if (other.hasFirstName()) {
                    bitField0_ |= 0x00000002;
                    firstName_ = other.firstName_;
                    onChanged();
                }
                if (other.hasLastName()) {
                    bitField0_ |= 0x00000004;
                    lastName_ = other.lastName_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasFirstName()) {

                    return false;
                }
                if (!hasLastName()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.soul.customerservice.CustomerProtos.Customer parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.soul.customerservice.CustomerProtos.Customer) e.getUnfinishedMessage();
                    throw e;
                }
                finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional int64 id = 1;
            private long id_;

            /**
             * <code>optional int64 id = 1;</code>
             */
            public boolean hasId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public Builder setId(long value) {
                bitField0_ |= 0x00000001;
                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public Builder clearId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                id_ = 0L;
                onChanged();
                return this;
            }

            // required string firstName = 2;
            private java.lang.Object firstName_ = "";

            /**
             * <code>required string firstName = 2;</code>
             */
            public boolean hasFirstName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required string firstName = 2;</code>
             */
            public java.lang.String getFirstName() {
                java.lang.Object ref = firstName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    firstName_ = s;
                    return s;
                }
                else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string firstName = 2;</code>
             */
            public com.google.protobuf.ByteString getFirstNameBytes() {
                java.lang.Object ref = firstName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                            .copyFromUtf8((java.lang.String) ref);
                    firstName_ = b;
                    return b;
                }
                else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string firstName = 2;</code>
             */
            public Builder setFirstName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                firstName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string firstName = 2;</code>
             */
            public Builder clearFirstName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                firstName_ = getDefaultInstance().getFirstName();
                onChanged();
                return this;
            }

            /**
             * <code>required string firstName = 2;</code>
             */
            public Builder setFirstNameBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                firstName_ = value;
                onChanged();
                return this;
            }

            // required string lastName = 3;
            private java.lang.Object lastName_ = "";

            /**
             * <code>required string lastName = 3;</code>
             */
            public boolean hasLastName() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>required string lastName = 3;</code>
             */
            public java.lang.String getLastName() {
                java.lang.Object ref = lastName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    lastName_ = s;
                    return s;
                }
                else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string lastName = 3;</code>
             */
            public com.google.protobuf.ByteString getLastNameBytes() {
                java.lang.Object ref = lastName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                            .copyFromUtf8((java.lang.String) ref);
                    lastName_ = b;
                    return b;
                }
                else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string lastName = 3;</code>
             */
            public Builder setLastName(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                lastName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string lastName = 3;</code>
             */
            public Builder clearLastName() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lastName_ = getDefaultInstance().getLastName();
                onChanged();
                return this;
            }

            /**
             * <code>required string lastName = 3;</code>
             */
            public Builder setLastNameBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                lastName_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:com.soul.customerservice.Customer)
        }

        static {
            defaultInstance = new Customer(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:com.soul.customerservice.Customer)
    }

    public interface CustomersOrBuilder extends
            com.google.protobuf.MessageOrBuilder {

        // repeated .com.soul.customerservice.Customer customer =
        // 1;
        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        java.util.List<com.soul.customerservice.CustomerProtos.Customer> getCustomerList();

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        com.soul.customerservice.CustomerProtos.Customer getCustomer(int index);

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        int getCustomerCount();

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        java.util.List<? extends com.soul.customerservice.CustomerProtos.CustomerOrBuilder> getCustomerOrBuilderList();

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        com.soul.customerservice.CustomerProtos.CustomerOrBuilder getCustomerOrBuilder(int index);
    }

    /**
     * Protobuf type {@code com.soul.customerservice.Customers}
     *
     * <pre>
     * &lt;2&gt;
     * </pre>
     */
    public static final class Customers extends
            com.google.protobuf.GeneratedMessage implements CustomersOrBuilder {

        // Use Customers.newBuilder() to
        // construct.
        private Customers(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Customers(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet
                    .getDefaultInstance();
        }

        private static final Customers defaultInstance;

        public static Customers getDefaultInstance() {
            return defaultInstance;
        }

        public Customers getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Customers(com.google.protobuf.CodedInputStream input,
                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
                    .newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                customer_ = new java.util.ArrayList<com.soul.customerservice.CustomerProtos.Customer>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            customer_.add(input.readMessage(com.soul.customerservice.CustomerProtos.Customer.PARSER,
                                    extensionRegistry));
                            break;
                        }
                    }
                }
            }
            catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
                        .setUnfinishedMessage(this);
            }
            finally {
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    customer_ = java.util.Collections.unmodifiableList(customer_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customers_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customers_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.soul.customerservice.CustomerProtos.Customers.class,
                            com.soul.customerservice.CustomerProtos.Customers.Builder.class);
        }

        public static com.google.protobuf.Parser<Customers> PARSER = new com.google.protobuf.AbstractParser<Customers>() {

            public Customers parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Customers(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<Customers> getParserForType() {
            return PARSER;
        }

        // repeated .com.soul.customerservice.Customer customer =
        // 1;
        public static final int CUSTOMER_FIELD_NUMBER = 1;

        private java.util.List<com.soul.customerservice.CustomerProtos.Customer> customer_;

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        public java.util.List<com.soul.customerservice.CustomerProtos.Customer> getCustomerList() {
            return customer_;
        }

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        public java.util.List<? extends com.soul.customerservice.CustomerProtos.CustomerOrBuilder> getCustomerOrBuilderList() {
            return customer_;
        }

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        public int getCustomerCount() {
            return customer_.size();
        }

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        public com.soul.customerservice.CustomerProtos.Customer getCustomer(int index) {
            return customer_.get(index);
        }

        /**
         * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
         */
        public com.soul.customerservice.CustomerProtos.CustomerOrBuilder getCustomerOrBuilder(int index) {
            return customer_.get(index);
        }

        private void initFields() {
            customer_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            for (int i = 0; i < getCustomerCount(); i++) {
                if (!getCustomer(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < customer_.size(); i++) {
                output.writeMessage(1, customer_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            for (int i = 0; i < customer_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(1,
                        customer_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(byte[] data,
                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.soul.customerservice.CustomerProtos.Customers parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.soul.customerservice.CustomerProtos.Customers prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type
         * {@code com.soul.customerservice.Customers}
         *
         * <pre>
         * &lt;2&gt;
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                com.soul.customerservice.CustomerProtos.CustomersOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customers_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customers_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(com.soul.customerservice.CustomerProtos.Customers.class,
                                com.soul.customerservice.CustomerProtos.Customers.Builder.class);
            }

            // Construct using
            // com.soul.customerservice.CustomerProtos.Customers.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getCustomerFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (customerBuilder_ == null) {
                    customer_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                else {
                    customerBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.soul.customerservice.CustomerProtos.internal_static_com_soul_customerservice_Customers_descriptor;
            }

            public com.soul.customerservice.CustomerProtos.Customers getDefaultInstanceForType() {
                return com.soul.customerservice.CustomerProtos.Customers.getDefaultInstance();
            }

            public com.soul.customerservice.CustomerProtos.Customers build() {
                com.soul.customerservice.CustomerProtos.Customers result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.soul.customerservice.CustomerProtos.Customers buildPartial() {
                com.soul.customerservice.CustomerProtos.Customers result = new com.soul.customerservice.CustomerProtos.Customers(
                        this);
                int from_bitField0_ = bitField0_;
                if (customerBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        customer_ = java.util.Collections.unmodifiableList(customer_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.customer_ = customer_;
                }
                else {
                    result.customer_ = customerBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.soul.customerservice.CustomerProtos.Customers) {
                    return mergeFrom((com.soul.customerservice.CustomerProtos.Customers) other);
                }
                else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.soul.customerservice.CustomerProtos.Customers other) {
                if (other == com.soul.customerservice.CustomerProtos.Customers.getDefaultInstance())
                    return this;
                if (customerBuilder_ == null) {
                    if (!other.customer_.isEmpty()) {
                        if (customer_.isEmpty()) {
                            customer_ = other.customer_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        }
                        else {
                            ensureCustomerIsMutable();
                            customer_.addAll(other.customer_);
                        }
                        onChanged();
                    }
                }
                else {
                    if (!other.customer_.isEmpty()) {
                        if (customerBuilder_.isEmpty()) {
                            customerBuilder_.dispose();
                            customerBuilder_ = null;
                            customer_ = other.customer_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            customerBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getCustomerFieldBuilder()
                                    : null;
                        }
                        else {
                            customerBuilder_.addAllMessages(other.customer_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getCustomerCount(); i++) {
                    if (!getCustomer(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.soul.customerservice.CustomerProtos.Customers parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.soul.customerservice.CustomerProtos.Customers) e.getUnfinishedMessage();
                    throw e;
                }
                finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // repeated .com.soul.customerservice.Customer customer =
            // 1;
            private java.util.List<com.soul.customerservice.CustomerProtos.Customer> customer_ = java.util.Collections
                    .emptyList();

            private void ensureCustomerIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    customer_ = new java.util.ArrayList<com.soul.customerservice.CustomerProtos.Customer>(
                            customer_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.soul.customerservice.CustomerProtos.Customer, com.soul.customerservice.CustomerProtos.Customer.Builder, com.soul.customerservice.CustomerProtos.CustomerOrBuilder> customerBuilder_;

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public java.util.List<com.soul.customerservice.CustomerProtos.Customer> getCustomerList() {
                if (customerBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(customer_);
                }
                else {
                    return customerBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public int getCustomerCount() {
                if (customerBuilder_ == null) {
                    return customer_.size();
                }
                else {
                    return customerBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public com.soul.customerservice.CustomerProtos.Customer getCustomer(int index) {
                if (customerBuilder_ == null) {
                    return customer_.get(index);
                }
                else {
                    return customerBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder setCustomer(int index, com.soul.customerservice.CustomerProtos.Customer value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomerIsMutable();
                    customer_.set(index, value);
                    onChanged();
                }
                else {
                    customerBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder setCustomer(int index,
                                       com.soul.customerservice.CustomerProtos.Customer.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    ensureCustomerIsMutable();
                    customer_.set(index, builderForValue.build());
                    onChanged();
                }
                else {
                    customerBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder addCustomer(com.soul.customerservice.CustomerProtos.Customer value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomerIsMutable();
                    customer_.add(value);
                    onChanged();
                }
                else {
                    customerBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder addCustomer(int index, com.soul.customerservice.CustomerProtos.Customer value) {
                if (customerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCustomerIsMutable();
                    customer_.add(index, value);
                    onChanged();
                }
                else {
                    customerBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder addCustomer(
                    com.soul.customerservice.CustomerProtos.Customer.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    ensureCustomerIsMutable();
                    customer_.add(builderForValue.build());
                    onChanged();
                }
                else {
                    customerBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder addCustomer(int index,
                                       com.soul.customerservice.CustomerProtos.Customer.Builder builderForValue) {
                if (customerBuilder_ == null) {
                    ensureCustomerIsMutable();
                    customer_.add(index, builderForValue.build());
                    onChanged();
                }
                else {
                    customerBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder addAllCustomer(
                    java.lang.Iterable<? extends com.soul.customerservice.CustomerProtos.Customer> values) {
                if (customerBuilder_ == null) {
                    ensureCustomerIsMutable();
                    super.addAll(values, customer_);
                    onChanged();
                }
                else {
                    customerBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder clearCustomer() {
                if (customerBuilder_ == null) {
                    customer_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                }
                else {
                    customerBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public Builder removeCustomer(int index) {
                if (customerBuilder_ == null) {
                    ensureCustomerIsMutable();
                    customer_.remove(index);
                    onChanged();
                }
                else {
                    customerBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public com.soul.customerservice.CustomerProtos.Customer.Builder getCustomerBuilder(int index) {
                return getCustomerFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public com.soul.customerservice.CustomerProtos.CustomerOrBuilder getCustomerOrBuilder(int index) {
                if (customerBuilder_ == null) {
                    return customer_.get(index);
                }
                else {
                    return customerBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public java.util.List<? extends com.soul.customerservice.CustomerProtos.CustomerOrBuilder> getCustomerOrBuilderList() {
                if (customerBuilder_ != null) {
                    return customerBuilder_.getMessageOrBuilderList();
                }
                else {
                    return java.util.Collections.unmodifiableList(customer_);
                }
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public com.soul.customerservice.CustomerProtos.Customer.Builder addCustomerBuilder() {
                return getCustomerFieldBuilder().addBuilder(
                        com.soul.customerservice.CustomerProtos.Customer.getDefaultInstance());
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public com.soul.customerservice.CustomerProtos.Customer.Builder addCustomerBuilder(int index) {
                return getCustomerFieldBuilder().addBuilder(index,
                        com.soul.customerservice.CustomerProtos.Customer.getDefaultInstance());
            }

            /**
             * <code>repeated .com.soul.customerservice.Customer customer = 1;</code>
             */
            public java.util.List<com.soul.customerservice.CustomerProtos.Customer.Builder> getCustomerBuilderList() {
                return getCustomerFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.soul.customerservice.CustomerProtos.Customer, com.soul.customerservice.CustomerProtos.Customer.Builder, com.soul.customerservice.CustomerProtos.CustomerOrBuilder> getCustomerFieldBuilder() {
                if (customerBuilder_ == null) {
                    customerBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<com.soul.customerservice.CustomerProtos.Customer, com.soul.customerservice.CustomerProtos.Customer.Builder, com.soul.customerservice.CustomerProtos.CustomerOrBuilder>(
                            customer_, ((bitField0_ & 0x00000001) == 0x00000001),
                            getParentForChildren(), isClean());
                    customer_ = null;
                }
                return customerBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:com.soul.customerservice.Customers)
        }

        static {
            defaultInstance = new Customers(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:com.soul.customerservice.Customers)
    }

    private static com.google.protobuf.Descriptors.Descriptor internal_static_com_soul_customerservice_Customer_descriptor;

    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_com_soul_customerservice_Customer_fieldAccessorTable;

    private static com.google.protobuf.Descriptors.Descriptor internal_static_com_soul_customerservice_Customers_descriptor;

    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_com_soul_customerservice_Customers_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = { "\n\016customer.proto\022\004com.soul.customerservice\";\n\010Customer\022\n\n\002id"
                + "\030\001 \001(\003\022\021\n\tfirstName\030\002 \002(\t\022\020\n\010lastName\030\003 "
                + "\002(\t\"-\n\tCustomers\022 \n\010customer\030\001 \003(\0132\016.dem"
                + "o.CustomerB\026\n\004com.soul.customerserviceB\016CustomerProtos" };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {

            public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                internal_static_com_soul_customerservice_Customer_descriptor = getDescriptor()
                        .getMessageTypes().get(0);
                internal_static_com_soul_customerservice_Customer_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_com_soul_customerservice_Customer_descriptor, new java.lang.String[] { "Id",
                        "FirstName", "LastName", });
                internal_static_com_soul_customerservice_Customers_descriptor = getDescriptor()
                        .getMessageTypes().get(1);
                internal_static_com_soul_customerservice_Customers_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_com_soul_customerservice_Customers_descriptor,
                        new java.lang.String[] { "Customer", });
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
