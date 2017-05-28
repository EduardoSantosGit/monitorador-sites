import os
from bottle import route, run, template, post, get, put, delete, response
import re, json

@get('/servicoweb/ping/:host')
def executa_ping(host):

	hostname = host
	response = os.system("ping -c 1 " + hostname)

	if response == 0:
	    param = {
			"StatusServicoSiteVO": {
					"statusPing": "ok"
			}
		}
	else:
		param = {
			"StatusServicoSiteVO": {
					"statusPing": "error"
			}
		}
	#response.header['Content-Type'] = 'application/json'	
	return json.dumps(param)

if __name__ == '__main__':
    port = int(os.environ.get('PORT', 8580))
    run(host='127.0.0.1', port=port, debug=True)