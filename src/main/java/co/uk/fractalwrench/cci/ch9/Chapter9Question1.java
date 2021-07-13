package co.uk.fractalwrench.cci.ch9;

public class Chapter9Question1 {

    /*
     * Question: Design a service that is called by up to 1000 concurrent clients that gets simple end-of-date stock
     * price information. How would the development, rollout, and monitoring/maintenance of this feed work?
     *
     * Answer: There are several important things to unroll here.
     *
     * - The data is static, apart from at the end of each day when it requires updating.
     * - The data will be heavily accessed by up to 1000 clients so caching is important.
     * - The data can be in any format.
     *
     * There are several ambiguities with the requirements:
     *
     * - Is it necessary to query an individual stock ticker, or send all the data in one go? In this case
     * hosting a JSON file on S3 and writing a cron job to update this at the end of each day might be sufficient.
     * - What currency is the stock price information?
     * - How many stock markets are tracked? There are many different markets and many thousands of different companies,
     * so this affects how much information is practical to transfer.
     *
     * If we assume the FTSE 100 then the simplest service would be to serve a JSON file on a service such as Amazon S3,
     * which is behind a CloudFront cache that acts as a CDN and reduces bandwidth costs. A program could be written
     * which formats the stock price information into JSON at a particular time each day, retrying every X minutes if
     * the information is not available or if the file cannot be written to the S3 bucket for whatever reason.
     *
     * For monitoring an automated alert service such as Pingdom could be used which checks a response for a given URL
     * is received. These automated checks should include some sort of check that the data is not stale - including a
     * generated timestamp in the JSON file would allow the monitoring to fail if the timestamp does not match the
     * current date for example, and alert developers that something has gone wrong with the service.
     *
     * Clients would need authentication, and rate limiting could be implemented to prevent abuse of the service.
     * Cache-Control headers could further reduce bandwidth use - although this might not be desirable for some clients
     * if they require precise and up-to-date price information.
     */


}
