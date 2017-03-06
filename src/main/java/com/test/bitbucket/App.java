package com.test.bitbucket;
import com.ccreanga.bitbucket.rest.client.http.BitBucketClientFactory;
import com.ccreanga.bitbucket.rest.client.http.BitBucketCredentials;
import com.ccreanga.bitbucket.rest.client.ProjectClient;
import com.ccreanga.bitbucket.rest.client.Range;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//Getting all the projects
        String bitBucketUrl = "input_url";
        String bitBucketUser = "input_id";
        String bitBucketPassword = "input_password";
        BitBucketClientFactory factory = new BitBucketClientFactory(bitBucketUrl,new BitBucketCredentials(bitBucketUser,bitBucketPassword));

        ProjectClient projectClient = factory.getProjectClient();

        System.out.println(projectClient.getProjects(new Range(0,100)));
    }
}
