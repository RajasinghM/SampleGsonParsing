package parsing.gson.com.samplegsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String geoUrl = "http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getJsonResponse();
    }

    public void getJsonResponse(){
        JsonObjectRequest jsonObjRequest = new JsonObjectRequest(Request.Method.GET, geoUrl, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {

                Log.d("JsonParsing",""+jsonObject);

                Gson gson = new Gson();
                Geonames gName = gson.fromJson(jsonObject.toString(),Geonames.class);

                List<Geonames> geonamesList = new ArrayList<Geonames>();
                geonamesList.add(gName);
                Log.d("Length", "-->"+geonamesList.size());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });

        RequestQueue requeue = Volley.newRequestQueue(MainActivity.this);
        requeue.add(jsonObjRequest);
    }
}
