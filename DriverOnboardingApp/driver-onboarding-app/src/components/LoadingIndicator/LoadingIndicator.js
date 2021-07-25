import Loader from 'react-loader-spinner';
import { usePromiseTracker } from "react-promise-tracker";

export default function LoadingIndicator (props) {
    const { promiseInProgress } = usePromiseTracker({area: props.area});

    return promiseInProgress &&
        <div
            style={{
                position: "fixed",
                top: "50%",
                left: "50%",
                textAlign: "center"
              }}
        >
            <Loader type="ThreeDots" color="#00acc1" height="100" width="100" />
        </div>
};