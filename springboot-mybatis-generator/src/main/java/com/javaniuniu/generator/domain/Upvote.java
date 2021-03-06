package com.javaniuniu.generator.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Upvote {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.upvote_id
     *
     * @mbg.generated
     */
    private Integer upvoteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.upvote_date
     *
     * @mbg.generated
     */
    private LocalDateTime upvoteDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.gmt_create
     *
     * @mbg.generated
     */
    private String gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.gmt_modified
     *
     * @mbg.generated
     */
    private String gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.from_id
     *
     * @mbg.generated
     */
    private Integer fromId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upvote.to_id
     *
     * @mbg.generated
     */
    private Integer toId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.upvote_id
     *
     * @return the value of upvote.upvote_id
     *
     * @mbg.generated
     */
    public Integer getUpvoteId() {
        return upvoteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.upvote_id
     *
     * @param upvoteId the value for upvote.upvote_id
     *
     * @mbg.generated
     */
    public void setUpvoteId(Integer upvoteId) {
        this.upvoteId = upvoteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.upvote_date
     *
     * @return the value of upvote.upvote_date
     *
     * @mbg.generated
     */
    public LocalDateTime getUpvoteDate() {
        return upvoteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.upvote_date
     *
     * @param upvoteDate the value for upvote.upvote_date
     *
     * @mbg.generated
     */
    public void setUpvoteDate(LocalDateTime upvoteDate) {
        this.upvoteDate = upvoteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.gmt_create
     *
     * @return the value of upvote.gmt_create
     *
     * @mbg.generated
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.gmt_create
     *
     * @param gmtCreate the value for upvote.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.gmt_modified
     *
     * @return the value of upvote.gmt_modified
     *
     * @mbg.generated
     */
    public String getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.gmt_modified
     *
     * @param gmtModified the value for upvote.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.status
     *
     * @return the value of upvote.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.status
     *
     * @param status the value for upvote.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.from_id
     *
     * @return the value of upvote.from_id
     *
     * @mbg.generated
     */
    public Integer getFromId() {
        return fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.from_id
     *
     * @param fromId the value for upvote.from_id
     *
     * @mbg.generated
     */
    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upvote.to_id
     *
     * @return the value of upvote.to_id
     *
     * @mbg.generated
     */
    public Integer getToId() {
        return toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upvote.to_id
     *
     * @param toId the value for upvote.to_id
     *
     * @mbg.generated
     */
    public void setToId(Integer toId) {
        this.toId = toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", upvoteId=").append(upvoteId);
        sb.append(", upvoteDate=").append(upvoteDate);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Upvote other = (Upvote) that;
        return (this.getUpvoteId() == null ? other.getUpvoteId() == null : this.getUpvoteId().equals(other.getUpvoteId()))
            && (this.getUpvoteDate() == null ? other.getUpvoteDate() == null : this.getUpvoteDate().equals(other.getUpvoteDate()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getToId() == null ? other.getToId() == null : this.getToId().equals(other.getToId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUpvoteId() == null) ? 0 : getUpvoteId().hashCode());
        result = prime * result + ((getUpvoteDate() == null) ? 0 : getUpvoteDate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getToId() == null) ? 0 : getToId().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table upvote
     *
     * @mbg.generated
     */
    public enum Column {
        upvoteId("upvote_id", "upvoteId", "INTEGER", false),
        upvoteDate("upvote_date", "upvoteDate", "TIMESTAMP", false),
        gmtCreate("gmt_create", "gmtCreate", "VARCHAR", false),
        gmtModified("gmt_modified", "gmtModified", "VARCHAR", false),
        status("status", "status", "VARCHAR", true),
        fromId("from_id", "fromId", "INTEGER", false),
        toId("to_id", "toId", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table upvote
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table upvote
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}