package com.example.dovah.inventoryappone.data;

import android.provider.BaseColumns;

public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {
    }

    public static final class BookEntry implements BaseColumns {

        /**
         * Name of database table
         */
        public final static String TABLE_NAME = "inventory";

        /**
         * Unique ID number for the book (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "name";

        /**
         * Price of the product.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PRICE = "price";

        /**
         * Quantity..
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_QUANTITY = "quantity";

        /**
         * Supplier Name.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";

        /**
         * Supplier Telephone.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_PHONE = "supplier_phone";
    }
}
