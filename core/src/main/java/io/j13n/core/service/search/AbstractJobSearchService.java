package io.j13n.core.service.search;

import dev.langchain4j.web.search.WebSearchRequest;
import dev.langchain4j.web.search.WebSearchResults;
import io.j13n.core.model.JobSearchResult;
import java.util.List;

public abstract class AbstractJobSearchService {

    protected static final int DEFAULT_MAX_RESULTS = 10;

    public abstract List<JobSearchResult> searchJobs(String query, String location, boolean isRemoteOnly);

    protected WebSearchRequest createJobSearchRequest(String query, String location, boolean isRemoteOnly) {
        StringBuilder searchQuery = new StringBuilder(query);

        if (location != null && !location.trim().isEmpty())
            searchQuery.append(" in ").append(location);

        if (isRemoteOnly) searchQuery.append(" remote");

        searchQuery.append(" job application apply");

        return WebSearchRequest.builder()
                .searchTerms(searchQuery.toString())
                .maxResults(DEFAULT_MAX_RESULTS)
                .build();
    }

    protected abstract List<JobSearchResult> parseSearchResults(WebSearchResults searchResults, String source);
}
