package responsibility.servlet;

import java.util.ArrayList;
import java.util.List;

public class ServletMain {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "request";

        Response response = new Response();
        response.str = "response";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request, response, filterChain);

        System.out.println();
    }
}

class Request {
    String str;
}

class Response {
    String str;
}

interface Filter {
    boolean doFilter(Request request, Response response, FilterChain filterChain);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("htmlFilter..." + request.str);
        filterChain.doFilter(request, response, filterChain);
        System.out.println("htmlFilter..." + response.str);
        return true;
    }
}

class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("sensitiveFilter..." + request.str);
        filterChain.doFilter(request, response, filterChain);
        System.out.println("sensitiveFilter..." + response.str);
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain filterChain) {

        if (index == filters.size()) {
            return false;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
        return true;
    }


}




