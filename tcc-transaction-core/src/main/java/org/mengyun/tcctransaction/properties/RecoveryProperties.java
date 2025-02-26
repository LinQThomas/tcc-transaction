package org.mengyun.tcctransaction.properties;

import org.mengyun.tcctransaction.recovery.RecoveryConfig;

/**
 * @author Nervose.Wu
 * @date 2022/5/24 09:45
 */
public class RecoveryProperties implements RecoveryConfig {

    private int maxRetryCount = 30;
    private int recoverDuration = 30;
    private String cronExpression = "0/30 * * * * ? ";
    private int fetchPageSize = 200;
    private int concurrentRecoveryThreadCount = Runtime.getRuntime().availableProcessors() * 2;
    //only used by client
    private boolean isRecoveryEnabled = true;
    private int quartzThreadPoolThreadCount = Runtime.getRuntime().availableProcessors() * 2 + 1;
    private String quartzDataSourceDriver = "com.mysql.jdbc.Driver";
    private String quartzDataSourceUrl = "jdbc:mysql://localhost:3306/TCC_SERVER?useSSL=false&allowPublicKeyRetrieval=true&connectTimeout=1000&socketTimeout=5000";
    private String quartzDataSourceUser = "root";
    private String quartzDataSourcePassword = "welcome1";
    private String quartzDataSourceValidationQuery = "select 1";
    private int quartzDataSourceCheckoutTimeout = 2000;
    private int quartzDataSourceInitialPoolSize = 1;
    private int quartzDataSourceMinPoolSize = 1;
    private int quartzDataSourceMaxPoolSize = 10;
    private boolean quartzClustered = false;
    private boolean updateJobForcibly = false;

    @Override
    public int getMaxRetryCount() {
        return maxRetryCount;
    }

    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    @Override
    public int getRecoverDuration() {
        return recoverDuration;
    }

    public void setRecoverDuration(int recoverDuration) {
        this.recoverDuration = recoverDuration;
    }

    @Override
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    @Override
    public int getFetchPageSize() {
        return fetchPageSize;
    }

    public void setFetchPageSize(int fetchPageSize) {
        this.fetchPageSize = fetchPageSize;
    }

    @Override
    public int getConcurrentRecoveryThreadCount() {
        return concurrentRecoveryThreadCount;
    }

    public void setConcurrentRecoveryThreadCount(int concurrentRecoveryThreadCount) {
        this.concurrentRecoveryThreadCount = concurrentRecoveryThreadCount;
    }

    @Override
    public boolean isRecoveryEnabled() {
        return isRecoveryEnabled;
    }

    public void setRecoveryEnabled(boolean recoveryEnabled) {
        isRecoveryEnabled = recoveryEnabled;
    }

    @Override
    public int getQuartzThreadPoolThreadCount() {
        return quartzThreadPoolThreadCount;
    }

    public void setQuartzThreadPoolThreadCount(int quartzThreadPoolThreadCount) {
        this.quartzThreadPoolThreadCount = quartzThreadPoolThreadCount;
    }

    @Override
    public String getQuartzDataSourceDriver() {
        return quartzDataSourceDriver;
    }

    public void setQuartzDataSourceDriver(String quartzDataSourceDriver) {
        this.quartzDataSourceDriver = quartzDataSourceDriver;
    }

    @Override
    public String getQuartzDataSourceUrl() {
        return quartzDataSourceUrl;
    }

    public void setQuartzDataSourceUrl(String quartzDataSourceUrl) {
        this.quartzDataSourceUrl = quartzDataSourceUrl;
    }

    @Override
    public String getQuartzDataSourceUser() {
        return quartzDataSourceUser;
    }

    public void setQuartzDataSourceUser(String quartzDataSourceUser) {
        this.quartzDataSourceUser = quartzDataSourceUser;
    }

    @Override
    public String getQuartzDataSourcePassword() {
        return quartzDataSourcePassword;
    }

    public void setQuartzDataSourcePassword(String quartzDataSourcePassword) {
        this.quartzDataSourcePassword = quartzDataSourcePassword;
    }

    @Override
    public String getQuartzDataSourceValidationQuery() {
        return quartzDataSourceValidationQuery;
    }

    public void setQuartzDataSourceValidationQuery(String quartzDataSourceValidationQuery) {
        this.quartzDataSourceValidationQuery = quartzDataSourceValidationQuery;
    }

    @Override
    public boolean isQuartzClustered() {
        return quartzClustered;
    }

    public void setQuartzClustered(boolean quartzClustered) {
        this.quartzClustered = quartzClustered;
    }

    @Override
    public boolean isUpdateJobForcibly() {
        return updateJobForcibly;
    }

    public void setUpdateJobForcibly(boolean updateJobForcibly) {
        this.updateJobForcibly = updateJobForcibly;
    }

    @Override
    public int getQuartzDataSourceCheckoutTimeout() {
        return quartzDataSourceCheckoutTimeout;
    }

    public void setQuartzDataSourceCheckoutTimeout(int quartzDataSourceCheckoutTimeout) {
        this.quartzDataSourceCheckoutTimeout = quartzDataSourceCheckoutTimeout;
    }

    @Override
    public int getQuartzDataSourceInitialPoolSize() {
        return quartzDataSourceInitialPoolSize;
    }

    public void setQuartzDataSourceInitialPoolSize(int quartzDataSourceInitialPoolSize) {
        this.quartzDataSourceInitialPoolSize = quartzDataSourceInitialPoolSize;
    }

    @Override
    public int getQuartzDataSourceMinPoolSize() {
        return quartzDataSourceMinPoolSize;
    }

    public void setQuartzDataSourceMinPoolSize(int quartzDataSourceMinPoolSize) {
        this.quartzDataSourceMinPoolSize = quartzDataSourceMinPoolSize;
    }

    @Override
    public int getQuartzDataSourceMaxPoolSize() {
        return quartzDataSourceMaxPoolSize;
    }

    public void setQuartzDataSourceMaxPoolSize(int quartzDataSourceMaxPoolSize) {
        this.quartzDataSourceMaxPoolSize = quartzDataSourceMaxPoolSize;
    }
}
