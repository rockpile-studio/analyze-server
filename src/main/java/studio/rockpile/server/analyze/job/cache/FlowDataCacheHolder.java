package studio.rockpile.server.analyze.job.cache;

import org.springframework.batch.core.JobParameter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class FlowDataCacheHolder {
    private Map<String, GenericDataEntity> rawsHash = new ConcurrentHashMap<>();
    private String errorStep = null;
    private Map<String, JobParameter> params = null;

    @Override
    public String toString() {
        return "FlowDataCacheHolder{" +
                "rawsHash=" + rawsHash +
                ", errorStep='" + errorStep + '\'' +
                ", params=" + params +
                '}';
    }

    public Map<String, GenericDataEntity> getRawsHash() {
        return rawsHash;
    }

    public void setRawsHash(Map<String, GenericDataEntity> rawsHash) {
        this.rawsHash = rawsHash;
    }

    public String getErrorStep() {
        return errorStep;
    }

    public void setErrorStep(String errorStep) {
        this.errorStep = errorStep;
    }

    public Map<String, JobParameter> getParams() {
        return params;
    }

    public void setParams(Map<String, JobParameter> params) {
        this.params = params;
    }
}
