
import json
from flask import Flask, Response

app = Flask(__name__)


@app.route('/health')
def health():
    result = {'status': 'UP'}

    return Response(json.dumps(result), mimetype='application/json')


@app.route('/getExampleResult')
def example():
    # result = "这是一条成功消息"
    result = {
            'code': '0',
            'msg': 'success',
            'date': '示例成功'
            }
    return Response(json.dumps(result), mimetype='application/json')


if __name__ == '__main__':
    app.run(port=5000, host='localhost')
